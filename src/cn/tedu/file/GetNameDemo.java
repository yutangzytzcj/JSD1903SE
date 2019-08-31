package cn.tedu.file;

import java.io.File;

public class GetNameDemo {
	public static void main(String[] args) {
		/*
		 * getName():String
		 * 获取文件名
		 * 案例:获取当前项目下hello.txt的名称
		 */
		File file = new File("hello.txt");
		String name = file.getName();
		System.out.println(name);
		
		/*
		 * length():long
		 * 获取文件内容的字节量
		 */
		long size = file.length();
		System.out.println(size);
	}

}










