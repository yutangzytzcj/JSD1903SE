package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ��Ʋ���
 * @author ta
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:����һ���ļ����������ڶ�ȡԭ�ļ�
		 * 2:����һ���ļ���������������ļ�д����
		 * 3:ѭ��ͨ���ļ���������ȡԭ�ļ���һ���ֽ�
		 *   ��ͨ���ļ������д�뵽�����ļ������
		 *   ���ƹ����� 
		 */
		FileInputStream fis
			= new FileInputStream("http.zip");  //   �ŵ�����Ŀ�µĸ�Ŀ¼���ˣ�
		FileOutputStream fos
			= new FileOutputStream("3.zip");		
		int len = -1;
		byte[] data = new byte[1024*10];//10k
		
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}		
		System.out.println("�������!");
		fis.close();
		fos.close();
	}
}



