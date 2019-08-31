package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * JAVA IO  java��׼�����������
 * 
 * java��IO�����ն�д���ܷ�Ϊ�������������
 * java.io.InputStream:�����ֽ��������ĳ��࣬�涨��
 * ��������ȡ�ֽڵ���ز�����
 * 
 * java.io.OutputStream:�����ֽ�������ĳ���,�涨��
 * �����д���ֽڵ���ز�����
 * 
 * java IO���Ա�׼�ķ�ʽ������豸���ж�д��ͨ������
 * ��ͬ�Ľڵ��������ض�����Դ�������ݽ�����
 * 
 * java������Ϊ������:�ڵ����봦����
 * �ڵ���:�ֳ�Ϊ�ͼ�������ʵ�����ӳ���������Դ��"�ܵ�"
 * ����ʵ�ʰ������ݵ�������дһ���ǽ����ڵͼ����Ļ�����
 * ���еġ�
 * 
 * ������:�ֳ�Ϊ�߼������߼������ܶ������ڣ�����������
 * �������ϣ�Ŀ���ǵ�����"����"��ǰ��ʱ���Զ������ĳ��
 * �ӹ������������Ƕ�д����ʱ�Ĳ�����
 * 
 * ����һ��߼����������ӵ��ͼ����ϣ��ڶ�д�Ĺ�������
 * ��ˮ��ʽ�ļӹ�������ɶ�д������Ϊ"��������"����Ҳ��
 * java IO�ľ�������(ѧϰ�ص�)
 * 
 * 
 * 
 * �ļ���
 * �ļ�����һ�Եͼ��������ڶ�д�ļ��������书����RAF
 * һ�¡����ǵײ�ʵ�ʵĶ�д��ʽ��ͬ��
 * RandomAccessFile����ָ����ʽ���ļ����������д�ģ�
 * ����RAF�ȿ��Զ�����Ҳ����д���ݣ����������ļ�����
 * ���ݵ��޸Ĳ�����
 * 
 * �ļ������Ա�׼IO��ʽ��д���ݵģ�����׼IO����˳��
 * ��д��ʽ���в�����(ֻ��������д�����ܻ��ˡ�)
 * 
 * �����ڶ�д����������ļ�������RAF�����������ļ���
 * ���Ա�׼IO��ʽ��д����������ǿ��������ӽ�һ������
 * �����ݶ�д�����򵥻�������RAF�������ġ�
 * 
 * 
 * 
 * 
 * @author ta
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {	
		FileOutputStream fos
			= new FileOutputStream("./fos.txt");
		
		String line = "���ף���~";
		byte[] data = line.getBytes("GBK");	
		fos.write(data);
		
		line = "����һ��������~��λ~��λ~";
		data = line.getBytes("GBK"); //   
		// ʹ�ø����� charset ���� String ���뵽 byte ���У���������洢���µ� byte ���顣
		//     ʹ��ָ�����ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С�
		fos.write(data);
		
		
		System.out.println("д�����!");
		
		fos.close();
	}
}













