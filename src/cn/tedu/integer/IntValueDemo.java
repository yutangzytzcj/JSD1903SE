package cn.tedu.integer;

public class IntValueDemo {
	public static void main(String[] args) {
		/*
		 * intValue():int
		 * ��װ����-->�������� 
		 */
		Integer integer = new Integer(12);
		//�õ��˶���Ļ������� -- int
		int i = integer.intValue();
		System.out.println(i);
		
		Double double1 = new Double(2.3);
		//Ҫ���ڼ���
		double d = double1.doubleValue();
		double x = d+3.3;
		System.out.println(x);
	}

}









