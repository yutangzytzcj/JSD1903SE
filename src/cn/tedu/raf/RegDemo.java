package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * 用户注册操作
 * 程序启动后，要求输入:
 * 用户名，密码，昵称，年龄
 * 将该用户信息写入文件user.dat中保存。
 * 
 * 每条记录占用100字节，其中用户名，密码，昵称为
 * 字符串类型，各占32字节。年龄为int值占用4字节。
 * 
 * 由于字符串的长度是根据实际内容决定的，因此在写文件
 * 时应当设计成故意"留白",不应当根据实际字符串长度写
 * 入，否则不利于读取和修改扩展。当然，此种操作的弊端
 * 在于会浪费部分磁盘空间。
 * 
 * 
 * 
 * @author ta
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("欢迎注册");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		
		System.out.println("请输入昵称:");
		String nickname = scanner.nextLine();
		
		System.out.println("请输入年龄:");
		int age = Integer.parseInt(
			scanner.nextLine()
		);
		
		System.out.println(username+","+password+","+nickname+","+age);
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","rw");
		//先将指针移动到文件末尾
		raf.seek(raf.length());
		
		
		//写用户名
		byte[] data = username.getBytes("UTF-8");
		//将字节数组扩容至32字节
		data = Arrays.copyOf(data, 32);
		//将32字节一次性写入文件
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//32
		
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//64
		
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//96
		
		//写年龄
		raf.writeInt(age);
		System.out.println("pos:"+raf.getFilePointer());//100
		
		System.out.println("注册完毕!");
		raf.close();
		
	}
}









