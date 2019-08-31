package cn.tedu.file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo02 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰ��Ŀ��������.��ͷ���ļ�
		 * listFiles(FileFilter):File[]
		 */
		File file = new File(".");
		
		//д�����ڲ������ - ���˵Ĺ���ʵ��
		FileFilter filter = new FileFilter() {
			//�˷�������ʵ�ֹ��ˣ�����������д�ڷ�������
			@Override
			public boolean accept(File file) {
				boolean flag1 = file.isFile();
				boolean flag2 = file.getName()
							.startsWith(".");
				return flag1 && flag2;
				/*
				 * ����������
				 * 	1.���ļ�
				 * 	2.��.��ͷ��
				 */
			}
		};
		
		//��ȡ��ǰ��Ŀ��������������������Ŀ
		File[] files = file.listFiles(filter);
		
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
	}

}








