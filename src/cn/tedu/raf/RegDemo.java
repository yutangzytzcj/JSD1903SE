package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * �û�ע�����
 * ����������Ҫ������:
 * �û��������룬�ǳƣ�����
 * �����û���Ϣд���ļ�user.dat�б��档
 * 
 * ÿ����¼ռ��100�ֽڣ������û��������룬�ǳ�Ϊ
 * �ַ������ͣ���ռ32�ֽڡ�����Ϊintֵռ��4�ֽڡ�
 * 
 * �����ַ����ĳ����Ǹ���ʵ�����ݾ����ģ������д�ļ�
 * ʱӦ����Ƴɹ���"����",��Ӧ������ʵ���ַ�������д
 * �룬�������ڶ�ȡ���޸���չ����Ȼ�����ֲ����ı׶�
 * ���ڻ��˷Ѳ��ִ��̿ռ䡣
 * 
 * 
 * 
 * @author ta
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("��ӭע��");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("����������:");
		String password = scanner.nextLine();
		
		System.out.println("�������ǳ�:");
		String nickname = scanner.nextLine();
		
		System.out.println("����������:");
		int age = Integer.parseInt(
			scanner.nextLine()
		);
		
		System.out.println(username+","+password+","+nickname+","+age);
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","rw");
		//�Ƚ�ָ���ƶ����ļ�ĩβ
		raf.seek(raf.length());
		
		
		//д�û���
		byte[] data = username.getBytes("UTF-8");
		//���ֽ�����������32�ֽ�
		data = Arrays.copyOf(data, 32);
		//��32�ֽ�һ����д���ļ�
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//32
		
		//д����
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//64
		
		//д�ǳ�
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		System.out.println("pos:"+raf.getFilePointer());//96
		
		//д����
		raf.writeInt(age);
		System.out.println("pos:"+raf.getFilePointer());//100
		
		System.out.println("ע�����!");
		raf.close();
		
	}
}









