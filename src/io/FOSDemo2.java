package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�����������ִ�����ʽ:
 * 
 * Ĭ�ϴ������ļ�������Ǹ���ģʽ.
 * 
 * @author ta
 *
 */
public class FOSDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * �������ַ�ʽ�������ļ����Ǹ���дģʽ����:
		 * ��д�������ļ��Ѿ����ڣ����ڴ��������ʱ
		 * �Ƚ����ļ����������Ȼ��ͨ������ļ����
		 * ��д����������Ϊ�ļ����ݱ��档
		 */
//		FileOutputStream fos
//			= new FileOutputStream("./fos.txt");
		
		/*
		 * �ڴ����ļ������ʱ������ڶ����������ò���
		 * Ϊһ��boolean���ͣ�ֵΪtrueʱ����׷��д
		 * ģʽ����:
		 * ���������ļ�������ʱ��ԭ����ȫ��������ͨ��
		 * ��ǰ�ļ������д�������ݻᱻ׷�ӵ��ļ�ĩβ
		 */
		FileOutputStream fos
			= new FileOutputStream("./fos.txt",true);
		
		String line = "��";
		byte[] data = line.getBytes("GBK");
		fos.write(data);
		line = "~~~";
		data = line.getBytes("GBK");
		fos.write(data);
		
		System.out.println("д�����!");

		fos.close();
	}
}