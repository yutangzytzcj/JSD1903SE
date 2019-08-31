package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 
 * ��������һ�Ը߼�����ʹ�����ǿ��Է�����ڶ������ֽ�
 * ֮�����ת�����������Ƕ�д�κ�java����
 * @author ta
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "����ʦ";
		String gender = "Ů";
		int age = 18;
		String[] otherInfo = {"�����˶�˫��̥","���Ǹ���Ա","�ٽ������Ļ�����","�������ͬ����������ʦ"};
		
		Person p = new Person(name,age,gender,otherInfo);
		System.out.println(p);
		/*
		 * ��Personʵ��д���ļ�person.obj��
		 */
		FileOutputStream fos
			= new FileOutputStream("person.obj");	
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object obj)
		 * ��������������ṹת��Ϊһ���ֽڲ�ͨ��
		 * ���������ӵ������������д��
		 * 
		 * ������ͨ��������д���ļ����ﾭ����������
		 * 1:�����󾭹����������ʱ�������������
		 *   �����������ṹת��Ϊ��һ���ֽڣ�����
		 *   �ֽڰ����˸ö���Ľṹ��Ϣ��ʵ�����ݡ�
		 *   ������̳�Ϊ"�������л�"
		 *   
		 * 2:���л���������ֽ��پ����ļ�����ͱ�д��
		 *   ���ļ��У�д���ļ��͵���д���˴���������
		 *   ���棬��������д����̵Ĺ��̳�Ϊ"���ݳ־û�"
		 * 
		 * 
		 */
		oos.writeObject(p);		
		System.out.println("д�����");	
		oos.close();
	}
}
















