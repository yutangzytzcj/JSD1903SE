package cn.tedu.integer;

public class AutoBoxDemo {
	public static void main(String[] args) {
		/*
		 * ��JDK1.5��ʼ��java�ṩ���Զ���װ�书��
		 * �Ǳ�����ʵ�ֵ�
		 * ���ʵ�֣�
		 * 	��������У���Integer i = 3;�滻����
		 * 	Integer i = Integer.valueOf(3);
		 */
		
		//װ��  int -->Integer
		Integer in = Integer.valueOf(3);
		//�Զ�װ��
		Integer in1 = 3;
		
		//����
		int a = in.intValue();
		//�Զ�����
		int b = in;
		System.out.println(b);
	}

}




