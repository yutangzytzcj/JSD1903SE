package cn.tedu.file;

import java.io.File;

public class IsFileDemo {
	public static void main(String[] args) {
		/*
		 * isFile():�ж��Ƿ����ļ�
		 */
		//�ж�file.txt�Ƿ����ļ�
		File file = new File("t/x");
		if(file.isFile()) {
			System.out.println("���ļ�");
		}else {
			System.out.println("�����ļ�");
		}
		
		/*
		 * isDirectory():�ж��Ƿ���Ŀ¼
		 */
		if(file.isDirectory()) {
			System.out.println("��Ŀ¼");
		}else {
			System.out.println("����Ŀ¼");
		}
		
		
	}

}









