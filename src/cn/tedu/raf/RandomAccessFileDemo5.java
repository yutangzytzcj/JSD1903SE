package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF基于指针的操作
 * @author ta
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","rw");
		//获取RAF当前指针的位置
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		int i = Integer.MAX_VALUE;
		/*
		 * void write(int d)
		 * 向文件中写入1个字节，写入的是给定的int值
		 * 对应2进制的"低八位"
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * i>>>24
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 */
		raf.write(i>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * RAF提供了方便写出基本类型数据的方法
		 * writeInt(int d) 连续写出4字节
		 * writeLong(long l) 连续写出8字节
		 */
		raf.writeInt(i);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(132L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("写出完毕!");
		
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * 连续读取4个字节并还原为int值
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long值
		//1 将指针移动到long的所在位置
		raf.seek(8);
		//2 连续读取8字节，将long值读取出来
		long lon = raf.readLong();
		System.out.println(lon);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
	}
}









