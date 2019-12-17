package com.chainup.common.log.utils;


import com.chainup.common.log.base.RolloverFailure;

import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A utility class using functionality available since JDK 1.7.
 *
 * @author ceki
 * @since 1.0.10
 */
public class FileStoreUtil {

    static final String PATH_CLASS_STR = "java.nio.file.Path";
    static final String FILES_CLASS_STR = "java.nio.file.Files";

    /**
     * This method assumes that both files a and b exists.
     *
     * @param a
     * @param b
     * @return
     * @throws RolloverFailure
     */
    static public boolean areOnSameFileStore(File a, File b) throws RolloverFailure {
        if (!a.exists()) {
            throw new IllegalArgumentException("File [" + a + "] does not exist.");
        }
        if (!b.exists()) {
            throw new IllegalArgumentException("File [" + b + "] does not exist.");
        }

        // Implements the following by reflection

        try {
            Path pathA = a.toPath();
            Path pathB = b.toPath();

            FileStore fileStoreA = Files.getFileStore(pathA);
            FileStore fileStoreB = Files.getFileStore(pathB);

            return fileStoreA.equals(fileStoreB);
        } catch (Exception e) {
            throw new RolloverFailure("Failed to check file store equality for [" + a + "] and [" + b + "]", e);
        }
    }
}
