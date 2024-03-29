package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 使用文件流完成简易记事本工具
 * 程序启动后，输入一个文件名，然后对该文件写操作。
 * 之后输入的每行字符串都写入该文件，当单独输入exit
 * 时程序结束。创建用覆盖写模式即可。
 * @author ta
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();	
		FileOutputStream fos
			= new FileOutputStream(fileName);		
		System.out.println("请开始输入内容:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			byte[] data = line.getBytes("gbk");
			fos.write(data);
		}	
		fos.close();
		System.out.println("再见!");
	}
}








