package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class ExistsDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * exists():boolean
		 * 判断文件是否存在，通常和其他方法一起使用
		 * eg:创建某个文件，若不存在，创建，
		 * 若存在，给出提示，不创建
		 */
		File file = new File("file.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("创建成功！");
		}else {
			System.out.println("文件已存在！");
		}
	}

}










