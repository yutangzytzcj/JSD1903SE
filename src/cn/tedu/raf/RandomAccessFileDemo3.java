package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAFд���ı�����
 * @author ta
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","rw");
		
		String str = "������˯�ѿ����ҵ����û����.";
		/*
		 * String�ṩ�˽��ַ���ת��Ϊ�ֽڵķ���
		 * byte[] getBytes()
		 * ����ϵͳĬ���ַ���ת����������ʹ��
		 * 
		 * byte[] getBytes(String csn)
		 * ����ָ�����ַ���ת��
		 */
		byte[] data = str.getBytes("UTF-8");
		/*
		 * void write(byte[] data)
		 * һ���Խ��������ֽ������������ֽ�д���ļ�
		 */
		raf.write(data);
		System.out.println("д�����!");
		
		raf.close();
		
	}
}







