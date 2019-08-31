package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 从文件中读取文本数据
 * @author ta
 *
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","r");		
		byte[] data = new byte[(int)raf.length()];
		//将文件中的所有字节读取出来
		raf.read(data);
		/*
		 * String(byte[] data,String csn)
		 * 将给定的字节数组中所有字节按照指定的字符集
		 * 还原为字符串
		 */
		String str = new String(data,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}
}







