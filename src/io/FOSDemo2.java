package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流的两种创建方式:
 * 
 * 默认创建的文件输出流是覆盖模式.
 * 
 * @author ta
 *
 */
public class FOSDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 下面这种方式创建的文件流是覆盖写模式，即:
		 * 若写操作的文件已经存在，则在创建输出流时
		 * 先将该文件数据清除，然后将通过这个文件输出
		 * 流写出的内容作为文件数据保存。
		 */
//		FileOutputStream fos
//			= new FileOutputStream("./fos.txt");
		
		/*
		 * 在创建文件输出流时若传入第二个参数，该参数
		 * 为一个boolean类型，值为true时则是追加写
		 * 模式，即:
		 * 当操作的文件若存在时，原数据全部保留，通过
		 * 当前文件输出流写出的内容会被追加到文件末尾
		 */
		FileOutputStream fos
			= new FileOutputStream("./fos.txt",true);
		
		String line = "呦";
		byte[] data = line.getBytes("GBK");
		fos.write(data);
		line = "~~~";
		data = line.getBytes("GBK");
		fos.write(data);
		
		System.out.println("写出完毕!");

		fos.close();
	}
}
