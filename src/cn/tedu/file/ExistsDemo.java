package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class ExistsDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * exists():boolean
		 * �ж��ļ��Ƿ���ڣ�ͨ������������һ��ʹ��
		 * eg:����ĳ���ļ����������ڣ�������
		 * �����ڣ�������ʾ��������
		 */
		File file = new File("file.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("�����ɹ���");
		}else {
			System.out.println("�ļ��Ѵ��ڣ�");
		}
	}

}










