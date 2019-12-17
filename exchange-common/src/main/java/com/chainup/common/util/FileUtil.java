package com.chainup.common.util;

import java.io.*;

public class FileUtil {

    public static void copyFile(String srcFile, String destFile)
            throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            byte[] buff = new byte[2048];
            int bytesRead;

            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            while (-1 != (bytesRead = in.read(buff, 0, buff.length))) {
                out.write(buff, 0, bytesRead);
            }

        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    public static void copyFile(File srcFile, File destFile)
            throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            byte[] buff = new byte[2048];
            int bytesRead;

            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            while (-1 != (bytesRead = in.read(buff, 0, buff.length))) {
                out.write(buff, 0, bytesRead);
            }

        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    public static boolean deleteFile(String fileName) throws IOException {
        File fl = new File(fileName);
        return fl.delete();
    }

    public static boolean deleteFile(String fileName, String rootDir)
            throws IOException {
        boolean bl = true;
        if (fileName.lastIndexOf("/") == fileName.length()) {
            fileName.substring(0, fileName.lastIndexOf("/"));
        }
        if (rootDir.lastIndexOf("/") == rootDir.length()) {
            rootDir.substring(0, rootDir.lastIndexOf("/"));
        }
        File fl = new File(fileName);
        String tempFileName = fileName;
        System.out.println("tempFileName=" + tempFileName);
        while (bl && !tempFileName.equals(rootDir)) {
            bl = fl.delete();
            int pos = tempFileName.lastIndexOf("/");
            tempFileName = tempFileName.substring(0, pos);
            System.out.println("tempFileName=" + tempFileName);
            fl = new File(tempFileName);
        }

        return bl;
    }

    public static boolean makeDir(String dirName)
            throws IOException {
        boolean bl = true;
        if (dirName.lastIndexOf("/") != dirName.length()) {
            dirName = dirName.concat("/");
            //System.out.println("dirName="+dirName);
        }
        int pos = 0;
        String temp = new String();
        while (dirName.lastIndexOf("/") > pos) {
            pos = dirName.indexOf("/", pos + 1);
            temp = dirName.substring(0, pos);
            File fl = new File(temp);
            if (!fl.isDirectory()) {
                bl = fl.mkdir();
            }
        }
        return bl;
    }

    public static void delWholeDir(String path)
            throws IOException {
        File file = new File(path);

        String[] contained = file.list();
        if (!file.exists()) {
            System.out.println("---FileUtil.delWholeDir():path to be deleted does not" +
                    " exist..");
        } else {
            for (int i = 0; i < contained.length; i++) {
                File tmpFile = new File(path + "/" + contained[i]);
                if (tmpFile.isDirectory()) {
                    
                    delWholeDir(path + "/" + contained[i]);
                } else {
                    tmpFile.delete();
                    
                }
            }
            
            file.delete();
        }
    }

    public static void copyFiles(String srcDir, String desDir)
            throws IOException {
        File file = new File(srcDir);
        String[] contained = file.list();
        if (contained == null) {
            System.out.println("---FileUtil.copyFile():srcDir does not exist..");
        } else {
            for (int i = 0; i < contained.length; i++) {
                File tmpSrcFile = new File(srcDir + "/" + contained[i]);
                File tmpDesFile = new File(desDir + "/" + contained[i]);
                if (tmpSrcFile.isDirectory()) {
                    
                    if (!tmpDesFile.exists()) {
                       
                        tmpDesFile.mkdir();
                    }
                    copyFiles(srcDir + "/" + contained[i], desDir + "/" + contained[i]);
                } else {
                    System.out.println("�ļ�--- " + srcDir + "/" + contained[i]);
                    if (tmpDesFile.exists()) {
                        
                        tmpDesFile.delete();
                        System.out.println("----tmpDesFile:" + tmpDesFile.getAbsolutePath());
                    }

                    FileUtil.makeDir(desDir);
                    tmpDesFile.createNewFile();

                    copyFile(srcDir + "/" + contained[i], desDir + "/" + contained[i]);
                }
            }
        }
    }

    public static void main(String args[]) {
        try {
            long cut = System.currentTimeMillis();
            System.out.println("---------------begin delete...");
            deleteFile("C:/Temp/~DF338F.tmp");

            //copyFile("F:/OADraft/mail/11-146920/J2EEandXML.zip","F:/OADraft/temp/J2EEandXML.zip");
            System.out.println("--------------- use " + (System.currentTimeMillis() - cut) / 1000 + " seconds!");
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
