package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ��ʵ�����Զ������Ķ����д����
 * 
 * ϣ�������������л��������ʵ�ֽӿ�:
 * java.io.Serializable
 * 
 * 
 * Serializable�ӿ���û���κγ��󷽷������Ǹýӿ���
 * ���������еģ����������ڱ���һ�����Դ����ʱ������
 * ��ʵ���˿����л��ӿڣ���ô���ڱ���class�ļ�ʱ����
 * һ����������������Ĺ����ǽ�������ʵ��ת��Ϊһ��
 * �ֽڡ�����������������������ö���ת��Ϊ�ֽڵġ�
 * ��������Դ�����в���Ҫ���֣��������ʵ�ֿ����л��ӿ�
 * ʱ����Ҫ��д�κη�����
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
	 * ��һ�����Ա��ؼ���transient���κ���ô��������ڽ���
	 * ���л�ʱ������Ե�ֵ�ᱻ���ԡ�
	 * ���Բ���Ҫ���л������Կ��Դﵽ����"����"��Ч����������Դ
	 * ������
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









