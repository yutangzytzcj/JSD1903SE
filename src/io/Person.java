package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类实例测试对象流的对象读写操作
 * 
 * 希望被对象流序列化的类必须实现接口:
 * java.io.Serializable
 * 
 * 
 * Serializable接口中没有任何抽象方法，但是该接口是
 * 编译器敏感的，当编译器在编译一个类的源代码时若发现
 * 其实现了可序列化接口，那么会在编译class文件时包含
 * 一个方法，这个方法的功能是将这个类的实例转换为一组
 * 字节。对象流就是用这个方法将该对象转换为字节的。
 * 但是由于源代码中不需要体现，因此我们实现可序列化接口
 * 时不需要重写任何方法。
 * 
 * @author ta
 *
 */
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * 当一个属性被关键字transient修饰后，那么这个对象在进行
	 * 序列化时这个属性的值会被忽略。
	 * 忽略不需要序列化的属性可以达到对象"瘦身"的效果，较少资源
	 * 开销。
	 */
	private transient String[] otherInfo;
	
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+
			   Arrays.toString(otherInfo);
	}
}










