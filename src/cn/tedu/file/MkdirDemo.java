package cn.tedu.file;

import java.io.File;

public class MkdirDemo {
	public static void main(String[] args) {
		/*
		 * mkdir():创建目录,若目录不存在，创建成功
		 * 若目录已经存在，创建失败，返回false
		 * 要求：在当前项目下创建hello目录
		 */
		File  file = new File("hello");
		boolean flag = file.mkdir();
		System.out.println(flag);
		
		/* 
		 * mkdirs():创建多级目录,若不存在，创建成功
		 * 			若已经存在，创建失败
		 * 多级目录：a/b/c/d
		 * 要求：在当前项目下创建 a/b/c/d/e
		 */
		File file2 = new File("a/b/c/d/e");
		flag = file2.mkdirs();
		System.out.println(flag);
		
	}

}







