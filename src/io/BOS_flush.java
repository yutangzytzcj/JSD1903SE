package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author ta
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String line = "ҹ������������.";		
		byte[] data = line.getBytes("GBK");
		
		bos.write(data);
		/*
		 * void flush()
		 * ǿ�ƽ���ǰ���������ѻ�����ֽ�һ����д����
		 * 
		 * Ƶ���ĵ���flush�����ʵ��д�����ݵ�Ƶ�ʣ�
		 * ��ή��д��Ч�ʣ����ǻ����д�����ݼ�ʱ�ԡ�
		 * �����������
		 */
		bos.flush();		
		System.out.println("д�����!");
		/*
		 * ��������closeʱ���Զ�flushһ�Ρ�
		 */
		bos.close();
	}
}






