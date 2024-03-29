package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 文件输入流，用于读取文件数据。
 * @author ta
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("fos.txt");
		
		byte[] data = new byte[1000];
		System.out.println(Arrays.toString(data));
		int len = fis.read(data);
		System.out.println(Arrays.toString(data));
		
		String str = new String(data,0,len,"GBK");
		System.out.println(str);
		System.out.println("实际读取了"+len+"个字节");
		
		
		fis.close();
	}
}








