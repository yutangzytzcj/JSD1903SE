package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用字节数组方式复制文件
		 * read(byte[]):int
		 * write(bys,0,len)
		 */
		//创建raf对象指向1.zip
		RandomAccessFile raf = new 
				RandomAccessFile("1.zip", "r");
		//创建raf1对象指向2.zip
		RandomAccessFile raf1 = new 
				RandomAccessFile("2.zip", "rw");
		long before = System.currentTimeMillis();
		//复制
		int len = -1; //表示读取到的实际长度
		byte[] bys = new byte[1024*10];
		while((len=raf.read(bys))!=-1) {
			raf1.write(bys,0,len);
		}
		long after = System.currentTimeMillis();
		long minus = after-before;
		System.out.println("用时："+minus+"毫秒");
		//关闭
		raf.close();
		raf1.close();
	}

}







