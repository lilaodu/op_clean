package com.chainup.common.util;

/**
 * byte数据追加类，自动扩展容量 可用于文件读取的数据存放在此类
 */
public class ByteBuffer {
	private int defaultCapacity = 1 * 1024; // 默认初始化时1KB容量
	private byte[] value;
	private int count;

	/**
	 * 默认初始化时1KB容量
	 */
	public ByteBuffer() {
		value = new byte[defaultCapacity];
		count = 0;
	}

	/**
	 * 指定容量,单位字节
	 * 
	 * @param capacity
	 */
	public ByteBuffer(int capacity) {
		if (capacity < defaultCapacity) {
			capacity = defaultCapacity;
		}
		value = new byte[capacity];
		count = 0;
	}

	/**
	 * 返回总字节长度
	 * 
	 * @return
	 */
	public int length() {
		return count;
	}

	/**
	 * 保证字节容量最小为指定的容量
	 * 
	 * @param minimumCapacity
	 */
	public synchronized void ensureCapacity(int minimumCapacity) {
		if (minimumCapacity > value.length) {
			expandCapacity(minimumCapacity);
		}
	}

	/**
	 * 扩展byteBuffer 的容量
	 * 
	 * @param minimumCapacity
	 *            所需最小尺寸
	 */
	private void expandCapacity(int minimumCapacity) {
		int newCapacity = (value.length + 1) * 2;
		if (newCapacity < 0) {
			newCapacity = Integer.MAX_VALUE;
		} else if (minimumCapacity > newCapacity) {
			newCapacity = minimumCapacity;
		}
		byte[] newValue = new byte[newCapacity];
		System.arraycopy(value, 0, newValue, 0, count);
		value = newValue;
	}

	/**
	 * 追加字节到byteBuffer
	 * 
	 * @param byt
	 * @return
	 */
	public ByteBuffer append(byte[] byt) {
		append(byt, 0, byt.length);
		return this;
	}

	/**
	 * 追加字节到byteBuffer
	 * 
	 * @param byt
	 * @param offset
	 *            byt起始位置
	 * @param len
	 *            长度
	 * @return
	 */
	public ByteBuffer append(byte[] byt, int offset, int len) {
		if (offset + len > byt.length) {
			return this;
		}
		int newCount = count + len;
		if (newCount > value.length) {
			expandCapacity(newCount);
		}
		System.arraycopy(byt, offset, value, count, len);
		count = newCount;

		return this;
	}

	/**
	 * 追加字节到byteBuffer
	 * 
	 * @param bf
	 * @return
	 */
	public ByteBuffer append(ByteBuffer bf) {
		if (bf == null || bf.length() < 1) {
			return this;
		}
		this.append(bf.array());

		return this;
	}

	/**
	 * 获得所有字节
	 * 
	 * @return
	 */
	public byte[] array() {
		byte[] b = new byte[count];
		System.arraycopy(value, 0, b, 0, count);
		return b;
	}
}
