package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * ��ȡraf.txt�е�����
		 * read():int
		 * ��ȡһ���ֽ����ݣ���int��ʽ����
		 * ����ȡ���ļ�ĩβ������-1
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		//��ȡ����
		int i = raf.read();
		System.out.println(i);
		i = raf.read();
		System.out.println(i);
		//�ر�
		raf.close();
	}

}










