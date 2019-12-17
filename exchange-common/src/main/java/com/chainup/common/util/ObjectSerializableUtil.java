package com.chainup.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializableUtil {
	public static byte[] objectToBytes(Object obj) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream so = new ObjectOutputStream(baos);
		so.writeObject(obj);
		byte[] bytes = baos.toByteArray();
		so.flush();
		baos.close();
		so.close();
		return bytes;
	}

	public static  Object bytesToObject(byte[] bytes) throws IOException,
			ClassNotFoundException {
		ByteArrayInputStream bain = new ByteArrayInputStream(bytes);
		ObjectInputStream oin = new ObjectInputStream(bain);
		Object object = oin.readObject();
		oin.close();
		bain.close();
		return object;
	}

	

}
