package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * 特点:读取效率高，可以按行读取字符串
 * @author ta
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 将当前源代码按行读取并输出到控制台
		 */
		FileInputStream fis
			= new FileInputStream("src/io/BRDemo.java");
		
		InputStreamReader isr
			= new InputStreamReader(fis);
		
		BufferedReader br
			= new BufferedReader(isr);
		
		String line = null;
		/*
		 * BufferedReader提供的方法:
		 * String readLine()
		 * 读取一行字符串，返回值不含有该行末尾的换行符
		 * 如果返回值为null，则表示读取到了流的末尾。
		 * 若是读取的文件，则表示文件读取到了末尾。
		 */
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
	}
}




