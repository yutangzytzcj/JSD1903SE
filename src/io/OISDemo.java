package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，用于读取一个java对象
 * 需要注意，读取的这组字节必须是通过对象输出流将
 * 一个对象转换的一组字节，否则读取过程会抛出异常。
 * @author ta
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		/*
		 * 对象输入流将一组字节按照其描述结构还原该对象
		 * 的过程称为:对象的反序列化
		 */
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		
	}
}








