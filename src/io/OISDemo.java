package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���������������ڶ�ȡһ��java����
 * ��Ҫע�⣬��ȡ�������ֽڱ�����ͨ�������������
 * һ������ת����һ���ֽڣ������ȡ���̻��׳��쳣��
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
		 * ������������һ���ֽڰ����������ṹ��ԭ�ö���
		 * �Ĺ��̳�Ϊ:����ķ����л�
		 */
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		
	}
}







