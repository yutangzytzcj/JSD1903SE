package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * ���ļ��ж�ȡ�ı�����
 * @author ta
 *
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","r");		
		byte[] data = new byte[(int)raf.length()];
		//���ļ��е������ֽڶ�ȡ����
		raf.read(data);
		/*
		 * String(byte[] data,String csn)
		 * ���������ֽ������������ֽڰ���ָ�����ַ���
		 * ��ԭΪ�ַ���
		 */
		String str = new String(data,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}
}







