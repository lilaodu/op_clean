package com.chainup.common.log.utils;


import com.chainup.common.log.base.RolloverFailure;

import java.io.*;

/**
 * @author Autorun
 */
public class FileUtil {

    public static boolean createMissingParentDirectories(File file) {
        File parent = file.getParentFile();
        if (parent == null) {
            // Parent directory not specified, therefore it's a request to
            // create nothing. Done! ;)
            return true;
        }

        // File.mkdirs() creates the parent directories only if they don't
        // already exist; and it's okay if they do.
        parent.mkdirs();
        return parent.exists();
    }


    public static String afterLastSlash(String sregex) {
        int i = sregex.lastIndexOf('/');
        if (i == -1) {
            return sregex;
        } else {
            return sregex.substring(i + 1);
        }
    }


    private static final int BUF_SIZE = 32 * 1024;

    public static void copy(String src, String destination) throws RolloverFailure {

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] inbuf = new byte[BUF_SIZE];
            int n;

            while ((n = bis.read(inbuf)) != -1) {
                bos.write(inbuf, 0, n);
            }
        } catch (IOException ioe) {
            String msg = "Failed to copy [" + src + "] to [" + destination + "]";
            throw new RolloverFailure(msg);
        }
    }
}
