package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF写出文本数据
 * @author ta
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","rw");
		
		String str = "有天我睡醒看到我的身边没有你.";
		/*
		 * String提供了将字符串转换为字节的方法
		 * byte[] getBytes()
		 * 按照系统默认字符集转换，不建议使用
		 * 
		 * byte[] getBytes(String csn)
		 * 按照指定的字符集转换
		 */
		byte[] data = str.getBytes("UTF-8");
		/*
		 * void write(byte[] data)
		 * 一次性将给定的字节数组中所有字节写入文件
		 */
		raf.write(data);
		System.out.println("写出完毕!");
		
		raf.close();
		
	}
}







