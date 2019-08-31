package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后，要求用户输入一个文件名，然后对该文件
 * 进行写操作。
 * 将用户之后输入的每一行字符串都写入到该文件中，直到
 * 用户单独输入了"exit"时，程序退出。
 * @author ta
 *
 */
public class NoteDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();	
		RandomAccessFile raf
			= new RandomAccessFile(fileName,"rw");		
		System.out.println("请开始输入内容:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			byte[] data = line.getBytes("gbk");
			raf.write(data);
		}	
		raf.close();
		System.out.println("再见!");
	}
}














