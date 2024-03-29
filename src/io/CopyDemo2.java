package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率完成文件复制操作。
 * 
 * 缓冲字节流:
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 缓冲流的功能为加快读写效率，无论我们操作流时的读写
 * 是单字节读写还是块读写，缓冲流最终都会转换为块读写
 * 来保证读写效率，从而起到加快读写效率的目的。
 * 
 * @author ta
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("movie.mp4");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos
			= new FileOutputStream("movie_cp.mp4");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		
		int d = -1;
		long start = System.currentTimeMillis();
		/*
		 * 缓冲流内部有一个字节数组作为缓冲区，当我们
		 * 使用缓冲输入流读取一字节(d = bis.read())时
		 * 实际上缓冲流会一次性读取一组字节并存入自己内
		 * 部的字节数组中(块读)，然后将第一个字节返回，
		 * 如果我们再次调用读取一字节方法时，缓冲流直接
		 * 将字节数组中第二个字节返回，直到所有字节均返
		 * 回后，才会再次实际读取一组字节回来。
		 * 因此，缓冲输入流就是将实际读取操作转换为块读
		 * 取操作来保证的读取效率。
		 * 缓冲输出流也是一样的道理。
		 */
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		
		bis.close();
		bos.close();
		
	}
}










