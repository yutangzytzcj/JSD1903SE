package cn.tedu.file;

import java.io.File;

public class IsFileDemo {
	public static void main(String[] args) {
		/*
		 * isFile():判断是否是文件
		 */
		//判断file.txt是否是文件
		File file = new File("t/x");
		if(file.isFile()) {
			System.out.println("是文件");
		}else {
			System.out.println("不是文件");
		}
		
		/*
		 * isDirectory():判断是否是目录
		 */
		if(file.isDirectory()) {
			System.out.println("是目录");
		}else {
			System.out.println("不是目录");
		}
		
		
	}

}









