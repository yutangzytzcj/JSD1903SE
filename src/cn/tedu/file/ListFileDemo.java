package cn.tedu.file;

import java.io.File;

public class ListFileDemo {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰ��Ŀ�����е�����Ŀ
		 * listFiles():File[]
		 */
		//����File����ָ��ǰ��Ŀ
		File file = new File(".");
		
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName();
			System.out.println(name);
		}
		
	}

}









