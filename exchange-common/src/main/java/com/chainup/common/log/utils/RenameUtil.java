package com.chainup.common.log.utils;


import com.chainup.common.log.base.RolloverFailure;

import java.io.File;

/**
 * @author Autorun
 */
public class RenameUtil {

    public static void rename(String src, String target) throws RolloverFailure {
        if (src.equals(target)) {
            return;
        }
        File srcFile = new File(src);

        if (srcFile.exists()) {
            File targetFile = new File(target);
            createMissingTargetDirsIfNecessary(targetFile);

            boolean result = srcFile.renameTo(targetFile);

            if (!result) {
                Boolean areOnDifferentVolumes = areOnDifferentVolumes(srcFile, targetFile);
                if (Boolean.TRUE.equals(areOnDifferentVolumes)) {
                    renameByCopying(src, target);
                    return;
                }
            }
        } else {
            throw new RolloverFailure("File [" + src + "] does not exist.");
        }
    }

    public static void createMissingTargetDirsIfNecessary(File toFile) throws RolloverFailure {
        boolean result = FileUtil.createMissingParentDirectories(toFile);
        if (!result) {
            throw new RolloverFailure("Failed to create parent directories for [" + toFile.getAbsolutePath() + "]");
        }
    }

    public static Boolean areOnDifferentVolumes(File srcFile, File targetFile) throws RolloverFailure {
        if (!EnvUtil.isJDK7OrHigher()) {
            return false;
        }

        // target file is not certain to exist but its parent has to exist given the call hierarchy of this method
        File parentOfTarget = targetFile.getAbsoluteFile().getParentFile();

        if (parentOfTarget == null) {
            return null;
        }
        if (!parentOfTarget.exists()) {
            return null;
        }

        try {
            boolean onSameFileStore = FileStoreUtil.areOnSameFileStore(srcFile, parentOfTarget);
            return !onSameFileStore;
        } catch (RolloverFailure rf) {
            return null;
        }
    }

    public static void renameByCopying(String src, String target) throws RolloverFailure {
        FileUtil.copy(src, target);

        File srcFile = new File(src);
        if (!srcFile.delete()) {
            throw new RolloverFailure("copy error");
        }
    }
}
