package cn.tedu.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ʾ����Ա����Ϣ
 * @author ta
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ʹ��RAF��ȡuser.dat�ļ�
		 * ѭ����ȡ���ļ���ѭ������Ӧ�����ļ�����/100
		 * ÿ����¼��ȡʱ:
		 * ���ȶ�ȡ32�ֽڣ������û����������ֽڰ���
		 * UTF-8����ת��Ϊ�ַ�����ע�⣬ת����Ҫtrim,
		 * ��Ϊ����ַ������пհ��ַ���
		 * �������ƶ�ȡ���룬�ǳơ�
		 * ֮���ٶ�ȡһ��intֵ����������䡣
		 * 
		 * �����ʽ����:
		 * ����,123456,����,22
		 */
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","r");
		
		for(int i=0;i<raf.length()/100;i++) {
			//��ȡ�û���
			byte[] data = new byte[32];
			raf.read(data);
			String username = new String(data,"UTF-8").trim();
			
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			
			int age = raf.readInt();
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(username+","+password+","+nickname+","+age);
		}
		
		raf.close();
	}
}






