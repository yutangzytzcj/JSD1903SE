package cn.tedu.file;

import java.io.File;

public class ListFileDemo {
	public static void main(String[] args) {
		/*
		 * 获取当前项目下所有的子项目
		 * listFiles():File[]
		 */
		//创建File对象指向当前项目
		File file = new File(".");
		
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName();
			System.out.println(name);
		}
		
	}

}









