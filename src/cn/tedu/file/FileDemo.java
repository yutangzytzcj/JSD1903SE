package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//���췽�� - File(String path)
		/*
		 * ·���ֳ�2�֣�
		 * 	����·����C��/a/b.txt
		 * 	���·����./test.txt
		 *	.��ʾ��ǰ��Ŀ
		 *
		 *	����ʹ��ʱ������ʹ�����·����
		 *	���Ժ��Բ�ͬ����ϵͳ·���Ĳ�������
		 */
		File file = new File("./hello.txt");
		/*
		 * �������ļ�
		 * ʹ��creatNewFile()�����ļ��������ļ�
		 * ���ڣ�����false
		 */
		boolean flag = file.createNewFile();
		System.out.println(flag);
	}

}







