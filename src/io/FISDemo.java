package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * �ļ������������ڶ�ȡ�ļ����ݡ�
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
		System.out.println("ʵ�ʶ�ȡ��"+len+"���ֽ�");
		
		
		fis.close();
	}
}







