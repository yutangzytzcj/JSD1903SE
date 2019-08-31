package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û������ӿ��дЧ������ļ����Ʋ�����
 * 
 * �����ֽ���:
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * �������Ĺ���Ϊ�ӿ��дЧ�ʣ��������ǲ�����ʱ�Ķ�д
 * �ǵ��ֽڶ�д���ǿ��д�����������ն���ת��Ϊ���д
 * ����֤��дЧ�ʣ��Ӷ��𵽼ӿ��дЧ�ʵ�Ŀ�ġ�
 * 
 * @author ta
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("movie.mp4");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos
			= new FileOutputStream("movie_cp.mp4");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		
		int d = -1;
		long start = System.currentTimeMillis();
		/*
		 * �������ڲ���һ���ֽ�������Ϊ��������������
		 * ʹ�û�����������ȡһ�ֽ�(d = bis.read())ʱ
		 * ʵ���ϻ�������һ���Զ�ȡһ���ֽڲ������Լ���
		 * �����ֽ�������(���)��Ȼ�󽫵�һ���ֽڷ��أ�
		 * ��������ٴε��ö�ȡһ�ֽڷ���ʱ��������ֱ��
		 * ���ֽ������еڶ����ֽڷ��أ�ֱ�������ֽھ���
		 * �غ󣬲Ż��ٴ�ʵ�ʶ�ȡһ���ֽڻ�����
		 * ��ˣ��������������ǽ�ʵ�ʶ�ȡ����ת��Ϊ���
		 * ȡ��������֤�Ķ�ȡЧ�ʡ�
		 * ���������Ҳ��һ���ĵ�����
		 */
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		
		bis.close();
		bos.close();
		
	}
}









