package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 
 * 对象流是一对高级流，使用它们可以方便的在对象与字节
 * 之间进行转换，方便我们读写任何java对象。
 * @author ta
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "苍老师";
		String gender = "女";
		int age = 18;
		String[] otherInfo = {"刚生了对双胞胎","曾是个演员","促进中日文化交流","广大男性同胞的启蒙老师"};
		
		Person p = new Person(name,age,gender,otherInfo);
		System.out.println(p);
		/*
		 * 将Person实例写入文件person.obj中
		 */
		FileOutputStream fos
			= new FileOutputStream("person.obj");	
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object obj)
		 * 将给定对象按照其结构转换为一组字节并通过
		 * 对象流连接的流将这组对象写出
		 * 
		 * 将对象通过对象流写入文件这里经历两个过程
		 * 1:当对象经过对象输出流时，对象输出流将
		 *   这个对象按照其结构转换为了一组字节，这组
		 *   字节包括了该对象的结构信息和实际数据。
		 *   这个过程称为"对象序列化"
		 *   
		 * 2:序列化后的这组字节再经过文件流后就被写入
		 *   了文件中，写入文件就等于写入了磁盘做长久
		 *   保存，而将数据写入磁盘的过程称为"数据持久化"
		 * 
		 * 
		 */
		oos.writeObject(p);		
		System.out.println("写出完毕");	
		oos.close();
	}
}

















