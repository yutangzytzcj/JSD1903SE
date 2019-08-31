package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF��д�����������ݣ��Լ�RAF����ָ��Ĳ���
 * @author ta
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","rw");
		//��ȡRAF��ǰָ���λ��
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		int i = Integer.MAX_VALUE;
		/*
		 * void write(int d)
		 * ���ļ���д��1���ֽڣ�д����Ǹ�����intֵ
		 * ��Ӧ2���Ƶ�"�Ͱ�λ"
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * i>>>24
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 */
		raf.write(i>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * RAF�ṩ�˷���д�������������ݵķ���
		 * writeInt(int d) ����д��4�ֽ�
		 * writeLong(long l) ����д��8�ֽ�
		 */
		raf.writeInt(i);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(132L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("д�����!");
		
		/*
		 * void seek(long pos)
		 * �ƶ�ָ�뵽ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * ������ȡ4���ֽڲ���ԭΪintֵ
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//��ȡlongֵ
		//1 ��ָ���ƶ���long������λ��
		raf.seek(8);
		//2 ������ȡ8�ֽڣ���longֵ��ȡ����
		long lon = raf.readLong();
		System.out.println(lon);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
	}
}









