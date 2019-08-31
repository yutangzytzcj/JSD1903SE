package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前项目下创建t/x/a.txt
		 * 应该分开创建
		 * 	1. 创建目录 - 多级目录
		 * 	2. 在目录下，再创建文件
		 */
		File file = new File("t/x");
		file.mkdirs();
		
		/*
		 * File(File parent,String child)
		 * File(String parent,String child)
		 * 在指定的父目录下创建子文件/目录
		 */
		File file2 = new File(file,"a.txt");
//		File file3 = new File("t/x","a.txt");
		
		file2.createNewFile();
		
	}

}









