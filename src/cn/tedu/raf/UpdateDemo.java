package cn.tedu.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��û��ǳƲ���
 * 
 * ����������Ҫ���û������û��������ǳ�
 * Ȼ��user.dat�ļ��ж�Ӧ���û����ǳƸ��¡�
 * ���û�������û�����user.dat�в����ڣ�����ʾ���޴���
 * 
 * @author ta
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * ˼·
		 * 1:����ѭ���ļ�����/100��
		 * 2:ÿ��ѭ����ʼʱ�Ƚ�ָ���ƶ���������¼��ʼλ��
		 * 3:��ȡ32�ֽڲ�ת��Ϊ�ַ���,��Ҫȥ�����߿հ�
		 *   ����������¼���û�����Ȼ��ȶ��Ƿ�Ϊ�û�����
		 *   �ģ���������ֱ�ӽ����´�ѭ��
		 * 4:���Ǹ��û������ٴ��ƶ�ָ�뵽������¼�ǳ�λ��
		 *   Ȼ���û�������ǳ�ת��Ϊ�ֽڲ�������32�ֽ�
		 *   Ȼ����дд���Ը���ԭ�ǳƴﵽ�޸��ǳƵ�Ŀ��
		 *   ֮��ֹͣѭ����  
		 * 5:����һ���������ѭ��������м�¼����ȡ����
		 *   û�бȶԳɹ����û�������˵�����û������ڣ�
		 *   ��ʱ������޴��ˡ�  
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("���������ǳ�:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","rw");
		
		//�Ƿ��н��й��޸�
		boolean updated = false;
		for(int i=0;i<raf.length()/100;i++) {
			//1�ƶ�ָ�뵽������¼��ʼλ��
			raf.seek(i*100);
			
			//2��ȡ�û���
			byte[] data = new byte[32];
			raf.read(data);
			
			//3��ԭ�û���
			String name = new String(data,"UTF-8").trim();
			if(name.equals(username)) {
				//�ƶ�ָ�뵽�ǳ�λ��
				raf.seek(i*100+64);
				
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("�޸ĳɹ�");
				updated = true;
				break;
			}
		}
		
		if(!updated) {
			System.out.println("���޴���");
		}
		
		raf.close();
		
	}
}









