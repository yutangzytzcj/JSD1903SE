package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * @author ta
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:创建一个文件输入流用于读取原文件
		 * 2:创建一个文件输出流用于向复制文件写数据
		 * 3:循环通过文件输入流读取原文件的一组字节
		 *   并通过文件输出流写入到复制文件中完成
		 *   复制工作。 
		 */
		FileInputStream fis
			= new FileInputStream("http.zip");  //   放到了项目下的根目录中了；
		FileOutputStream fos
			= new FileOutputStream("3.zip");		
		int len = -1;
		byte[] data = new byte[1024*10];//10k
		
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}		
		System.out.println("复制完毕!");
		fis.close();
		fos.close();
	}
}




