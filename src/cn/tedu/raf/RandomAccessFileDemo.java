package cn.tedu.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ��raf.txt�ļ���д��һ���ֽ�
		 * write(int i)
		 */
		//����Raf����
		//ͨ���˶������ļ���д���ݣ����ļ������ڣ��Զ�����
//		RandomAccessFile raf = new 
//				RandomAccessFile("raf.txt", "rw");
//		//д����
//		raf.write(97);
//		
//		//�ر�
//		raf.close();
		
		/*
		 * ��raf2.txt�ļ���д��26��Ӣ����ĸ
		 */
		RandomAccessFile raf = new 
				RandomAccessFile("raf2.txt", "rw");
		//forѭ�����ļ���д����ĸ
		for(int i=0;i<26;i++) {
			raf.write(97+i);
		}
		
		//�ر�
		raf.close();
		
	}

}









