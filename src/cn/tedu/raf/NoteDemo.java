package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ���׼��±�����
 * ����������Ҫ���û�����һ���ļ�����Ȼ��Ը��ļ�
 * ����д������
 * ���û�֮�������ÿһ���ַ�����д�뵽���ļ��У�ֱ��
 * �û�����������"exit"ʱ�������˳���
 * @author ta
 *
 */
public class NoteDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();	
		RandomAccessFile raf
			= new RandomAccessFile(fileName,"rw");		
		System.out.println("�뿪ʼ��������:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			byte[] data = line.getBytes("gbk");
			raf.write(data);
		}	
		raf.close();
		System.out.println("�ټ�!");
	}
}














