package cn.tedu.integer;

public class ValueOfDemo {
	public static void main(String[] args) {
		/*
		 * ���췽��
		 * Integer(int i):����һ��Integer�����ڲ�
		 * ��װ��ֵ��i
		 */
		Integer integer = new Integer(23);
		
		/*
		 * valueOf(int i):Integer
		 * ��������������ת��Ϊ��װ����
		 * 8�ְ�װ�඼��toString()��������д
		 */
		int i = 3;
		Integer in = Integer.valueOf(i);
		System.out.println(in);
		
		double d = 3.4;
		//�õ�double��Ӧ�İ�װ���Ͷ���
		Double double1 = Double.valueOf(d);
		System.out.println(double1);
	}

}









