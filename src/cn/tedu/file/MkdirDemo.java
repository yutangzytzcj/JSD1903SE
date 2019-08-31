package cn.tedu.file;

import java.io.File;

public class MkdirDemo {
	public static void main(String[] args) {
		/*
		 * mkdir():����Ŀ¼,��Ŀ¼�����ڣ������ɹ�
		 * ��Ŀ¼�Ѿ����ڣ�����ʧ�ܣ�����false
		 * Ҫ���ڵ�ǰ��Ŀ�´���helloĿ¼
		 */
		File  file = new File("hello");
		boolean flag = file.mkdir();
		System.out.println(flag);
		
		/* 
		 * mkdirs():�����༶Ŀ¼,�������ڣ������ɹ�
		 * 			���Ѿ����ڣ�����ʧ��
		 * �༶Ŀ¼��a/b/c/d
		 * Ҫ���ڵ�ǰ��Ŀ�´��� a/b/c/d/e
		 */
		File file2 = new File("a/b/c/d/e");
		flag = file2.mkdirs();
		System.out.println(flag);
		
	}

}







