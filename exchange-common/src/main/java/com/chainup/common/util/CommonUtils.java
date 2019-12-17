package com.chainup.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CommonUtils {

    // buffer 转String
    public static String byteBufferToString(ByteBuffer buffer) {
        CharBuffer charBuffer = null;
        try {
            Charset charset = Charset.forName("ISO-8859-1");
            CharsetDecoder decoder = charset.newDecoder();
            charBuffer = decoder.decode(buffer);
            buffer.flip();
            return charBuffer.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // 压缩
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString("ISO-8859-1");
    }

    // 解压缩
    public static String uncompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        GZIPInputStream gunzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        return out.toString();
    }


    /**
     * 非空判断
     *
     * @param objs 要判断,处理的对象
     * @return Boolean
     * @author <a href="mailto:benjobs@qq.com">Ben</a>
     * @see <b>对象为Null返回true,集合的大小为0也返回true,迭代器没有下一个也返回true..</b>
     * @since 1.0
     */
    public static Boolean isEmpty(Object... objs) {

        if (objs == null) {
            return Boolean.TRUE;
        }

        if (objs.length == 0) return Boolean.TRUE;

        for (Object obj : objs) {
            if (obj == null) {
                return true;
            }

            // 字符序列集
            if ((obj instanceof CharSequence) && "".equals(obj.toString().trim())) {
                return true;
            }
            // 单列集合
            if (obj instanceof Collection) {
                if (((Collection<?>) obj).isEmpty()) {
                    return true;
                }
            }
            // 双列集合
            if (obj instanceof Map) {
                if (((Map<?, ?>) obj).isEmpty()) {
                    return true;
                }
            }

            if (obj instanceof Iterable) {
                if (((Iterable<?>) obj).iterator() == null || !((Iterable<?>) obj).iterator().hasNext()) {
                    return true;
                }
            }

            // 迭代器
            if (obj instanceof Iterator) {
                if (!((Iterator<?>) obj).hasNext()) {
                    return true;
                }
            }

            // 文件类型
            if (obj instanceof File) {
                if (!((File) obj).exists()) {
                    return true;
                }
            }

            if ((obj instanceof Object[]) && ((Object[]) obj).length == 0) {
                return true;
            }
        }

        return false;
    }
}