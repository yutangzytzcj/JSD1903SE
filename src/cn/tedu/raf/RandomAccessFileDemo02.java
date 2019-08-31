package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 读取raf.txt中的数据
		 * read():int
		 * 读取一个字节数据，以int形式返回
		 * 若读取到文件末尾，返回-1
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		//读取数据
		int i = raf.read();
		System.out.println(i);
		i = raf.read();
		System.out.println(i);
		//关闭
		raf.close();
	}

}










