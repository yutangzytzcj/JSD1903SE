package cn.tedu.file;

import java.io.File;

public class DeleteDemo {
	public static void main(String[] args) {
		/*
		 * delete():ɾ���ļ�/Ŀ¼
		 * ��ɾ����Ŀ¼�»�����Ŀ¼/�ļ���ɾ��ʧ��
		 * ɾ���������ײ㿪ʼ�������ɾ
		 */
		File file = new File("a");
		boolean flag = file.delete();
		System.out.println(flag);
		
		/*
		 * ɾ��t/x/a.txt�ļ�
		 */
		File file2 = new File("t/x/a.txt");
		flag = file2.delete();
		System.out.println(flag);
	}

}








