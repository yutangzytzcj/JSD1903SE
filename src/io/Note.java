package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ʹ���ļ�����ɼ��׼��±�����
 * ��������������һ���ļ�����Ȼ��Ը��ļ�д������
 * ֮�������ÿ���ַ�����д����ļ�������������exit
 * ʱ��������������ø���дģʽ���ɡ�
 * @author ta
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();	
		FileOutputStream fos
			= new FileOutputStream(fileName);		
		System.out.println("�뿪ʼ��������:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			byte[] data = line.getBytes("gbk");
			fos.write(data);
		}	
		fos.close();
		System.out.println("�ټ�!");
	}
}







