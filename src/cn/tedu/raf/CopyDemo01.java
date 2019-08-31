package cn.tedu.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 复制文件：先读后写
		 */
		//创建raf对象表示11.jpg
		RandomAccessFile raf = new 
				RandomAccessFile("1.zip", "r");
		//创建raf1对象指向copy.jpg
		RandomAccessFile raf1 = new 
				RandomAccessFile("2.zip", "rw");
		//复制
		long before = System.currentTimeMillis();
		int d = -1; //表示读取到的数据
		while((d=raf.read())!=-1) {
			raf1.write(d); //写入目标文件中
		}
		System.out.println("复制完毕！");
		long after = System.currentTimeMillis();
		System.out.println(after-before);
		raf.close(); //关闭
		raf1.close(); //关闭
		
	}

}









