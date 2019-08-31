package cn.tedu.file;

import java.io.File;

public class DeleteMulFileDemo {
	public static void main(String[] args) {
		/*
		 * 删除当前项目下的a目录（是个多级目录）
		 * 思路：
		 * 		1. 创建对象表示a目录，调用deleteFile(File)删除
		 * 		2. 自定义方法deleteFile(File)用于删除文件/目录
		 * 			内部实现：
		 * 				对File进行判断
		 * 					若是目录
		 * 						获取子项目并遍历
		 * 							将遍历到的子项目删除-调用delteFile(File)
		 * 					若是文件：
		 * 						删除
		 */
		//创建File对象
		File file = new File("a");
		DeleteMulFileDemo demo = new DeleteMulFileDemo();
		demo.deleteFile(file);
		
	}
	
	
	//删除指定的文件/目录
	public void deleteFile(File file) {
		//判断file是否是目录
		if(file.isDirectory()) {
			//获取其子项目
			File[] subs = file.listFiles();
			//遍历所有子项目
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				//删除子项目(可以是文件/目录)
				deleteFile(sub);
			}
		}
		//是文件
		file.delete();
	}

}








