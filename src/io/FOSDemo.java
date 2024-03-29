package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * JAVA IO  java标准的输入与输出
 * 
 * java将IO流按照读写功能分为输入流与输出流
 * java.io.InputStream:所有字节输入流的超类，规定了
 * 输入流读取字节的相关操作。
 * 
 * java.io.OutputStream:所有字节输出流的超类,规定了
 * 输出流写出字节的相关操作。
 * 
 * java IO流以标准的方式对外界设备进行读写，通过创建
 * 不同的节点流来与特定数据源进行数据交互。
 * 
 * java将流分为两大类:节点流与处理流
 * 节点流:又称为低级流，是实际连接程序与数据源的"管道"
 * 用于实际搬运数据的流，读写一定是建立在低级流的基础上
 * 进行的。
 * 
 * 处理流:又称为高级流，高级流不能独立存在，必须连接在
 * 其他流上，目的是当数据"流经"当前流时可以对其进行某种
 * 加工处理，简化我们读写数据时的操作。
 * 
 * 串联一组高级流最终连接到低级流上，在读写的过程中以
 * 流水线式的加工处理完成读写操作称为"流的连接"，这也是
 * java IO的精髓所在(学习重点)
 * 
 * 
 * 
 * 文件流
 * 文件流是一对低级流，用于读写文件的流。其功能与RAF
 * 一致。但是底层实际的读写方式不同。
 * RandomAccessFile是以指针形式对文件进行随机读写的，
 * 并且RAF既可以读数据也可以写数据，能做到对文件部分
 * 数据的修改操作。
 * 
 * 文件流是以标准IO形式读写数据的，而标准IO是以顺序
 * 读写形式进行操作的(只能向后读或写，不能回退。)
 * 
 * 所以在读写的灵活性上文件流不如RAF，但是由于文件流
 * 是以标准IO形式读写，可以利用强大的流连接将一个复杂
 * 的数据读写操作简单化，这是RAF做不到的。
 * 
 * 
 * 
 * 
 * @author ta
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {	
		FileOutputStream fos
			= new FileOutputStream("./fos.txt");
		
		String line = "回首，掏~";
		byte[] data = line.getBytes("GBK");	
		fos.write(data);
		
		line = "鬼刀一开看不见~走位~走位~";
		data = line.getBytes("GBK"); //   
		// 使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
		//     使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
		fos.write(data);
		
		
		System.out.println("写出完毕!");
		
		fos.close();
	}
}














