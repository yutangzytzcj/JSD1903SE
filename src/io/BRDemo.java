package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * �ص�:��ȡЧ�ʸߣ����԰��ж�ȡ�ַ���
 * @author ta
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰԴ���밴�ж�ȡ�����������̨
		 */
		FileInputStream fis
			= new FileInputStream("src/io/BRDemo.java");
		
		InputStreamReader isr
			= new InputStreamReader(fis);
		
		BufferedReader br
			= new BufferedReader(isr);
		
		String line = null;
		/*
		 * BufferedReader�ṩ�ķ���:
		 * String readLine()
		 * ��ȡһ���ַ���������ֵ�����и���ĩβ�Ļ��з�
		 * �������ֵΪnull�����ʾ��ȡ��������ĩβ��
		 * ���Ƕ�ȡ���ļ������ʾ�ļ���ȡ����ĩβ��
		 */
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
	}
}




