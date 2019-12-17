package com.chainup.common.log.base.steram;

import java.io.*;

/**
 * @author Autorun
 */
public class BufferdFileOutputStream extends OutputStream {

    private File file;
    private FileOutputStream fos;
    protected OutputStream os;

    public BufferdFileOutputStream(File file, boolean append, int bufferSize) throws FileNotFoundException {
        this.file = file;
        fos = new FileOutputStream(file, append);
        this.os = new BufferedOutputStream(fos, bufferSize);
    }

    @Override
    public void write(int b) {
        try {
            os.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(byte[] b, int off, int len) {
        try {
            os.write(b, off, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() {
        if (os != null) {
            try {
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close() throws IOException {
        if (os != null) {
            os.close();
        }
    }
}
