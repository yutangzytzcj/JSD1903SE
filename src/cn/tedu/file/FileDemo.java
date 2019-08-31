package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//构造方法 - File(String path)
		/*
		 * 路径分成2种：
		 * 	绝对路径：C：/a/b.txt
		 * 	相对路径：./test.txt
		 *	.表示当前项目
		 *
		 *	我们使用时，建议使用相对路径，
		 *	可以忽略不同操作系统路径的差异问题
		 */
		File file = new File("./hello.txt");
		/*
		 * 创建此文件
		 * 使用creatNewFile()创建文件对象，若文件
		 * 存在，返回false
		 */
		boolean flag = file.createNewFile();
		System.out.println(flag);
	}

}







