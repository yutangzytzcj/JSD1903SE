package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author ta
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String line = "夜空中最亮的星.";		
		byte[] data = line.getBytes("GBK");
		
		bos.write(data);
		/*
		 * void flush()
		 * 强制将当前缓冲流中已缓存的字节一次性写出。
		 * 
		 * 频繁的调用flush会提高实际写出数据的频率，
		 * 这会降低写出效率，但是会提高写出数据即时性。
		 * 根据需求而定
		 */
		bos.flush();		
		System.out.println("写出完毕!");
		/*
		 * 缓冲流在close时会自动flush一次。
		 */
		bos.close();
	}
}







