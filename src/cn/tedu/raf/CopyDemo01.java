package cn.tedu.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * �����ļ����ȶ���д
		 */
		//����raf�����ʾ11.jpg
		RandomAccessFile raf = new 
				RandomAccessFile("1.zip", "r");
		//����raf1����ָ��copy.jpg
		RandomAccessFile raf1 = new 
				RandomAccessFile("2.zip", "rw");
		//����
		long before = System.currentTimeMillis();
		int d = -1; //��ʾ��ȡ��������
		while((d=raf.read())!=-1) {
			raf1.write(d); //д��Ŀ���ļ���
		}
		System.out.println("������ϣ�");
		long after = System.currentTimeMillis();
		System.out.println(after-before);
		raf.close(); //�ر�
		raf1.close(); //�ر�
		
	}

}









