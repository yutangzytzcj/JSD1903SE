package cn.tedu.file;

import java.io.File;

public class DeleteDemo {
	public static void main(String[] args) {
		/*
		 * delete():删除文件/目录
		 * 若删除的目录下还有子目录/文件，删除失败
		 * 删除必须从最底层开始逐层往上删
		 */
		File file = new File("a");
		boolean flag = file.delete();
		System.out.println(flag);
		
		/*
		 * 删除t/x/a.txt文件
		 */
		File file2 = new File("t/x/a.txt");
		flag = file2.delete();
		System.out.println(flag);
	}

}








