package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * ʹ���ֽ����鷽ʽ�����ļ�
		 * read(byte[]):int
		 * write(bys,0,len)
		 */
		//����raf����ָ��1.zip
		RandomAccessFile raf = new 
				RandomAccessFile("1.zip", "r");
		//����raf1����ָ��2.zip
		RandomAccessFile raf1 = new 
				RandomAccessFile("2.zip", "rw");
		long before = System.currentTimeMillis();
		//����
		int len = -1; //��ʾ��ȡ����ʵ�ʳ���
		byte[] bys = new byte[1024*10];
		while((len=raf.read(bys))!=-1) {
			raf1.write(bys,0,len);
		}
		long after = System.currentTimeMillis();
		long minus = after-before;
		System.out.println("��ʱ��"+minus+"����");
		//�ر�
		raf.close();
		raf1.close();
	}

}







