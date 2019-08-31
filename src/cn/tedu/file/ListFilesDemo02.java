package cn.tedu.file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo02 {
	public static void main(String[] args) {
		/*
		 * 获取当前项目下所有以.开头的文件
		 * listFiles(FileFilter):File[]
		 */
		File file = new File(".");
		
		//写匿名内部类对象 - 过滤的功能实现
		FileFilter filter = new FileFilter() {
			//此方法用于实现过滤，将过滤条件写在方法体中
			@Override
			public boolean accept(File file) {
				boolean flag1 = file.isFile();
				boolean flag2 = file.getName()
							.startsWith(".");
				return flag1 && flag2;
				/*
				 * 过滤条件：
				 * 	1.是文件
				 * 	2.以.开头的
				 */
			}
		};
		
		//获取当前项目下所有满足条件的子项目
		File[] files = file.listFiles(filter);
		
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
	}

}








