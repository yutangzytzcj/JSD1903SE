package cn.tedu.file;

import java.io.File;

public class GetNameDemo {
	public static void main(String[] args) {
		/*
		 * getName():String
		 * ��ȡ�ļ���
		 * ����:��ȡ��ǰ��Ŀ��hello.txt������
		 */
		File file = new File("hello.txt");
		String name = file.getName();
		System.out.println(name);
		
		/*
		 * length():long
		 * ��ȡ�ļ����ݵ��ֽ���
		 */
		long size = file.length();
		System.out.println(size);
	}

}










