package cn.tedu.file;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * ���������⣺��׳�
		 * ˼·��
		 * 		1.�û�������ֵ
		 * 		2.�Զ��巽����׳�
		 */
		System.out.println("������һ��������");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		//��׳�
		Demo01 demo01 = new Demo01();
		int result = demo01.f(n);
		System.out.println(result);
	}
	
	/*
	 * ��׳�
	 * �׳ˣ�5�� = 5*4*3*2*1;
	 * 	    5! = 5*4!;
	 * 		4! = 4*3!;
	 * 		3! = 3*2!;
	 * 		2! = 2*1!;  1!��1*1 = 1;
	 */
	public int f(int n) {
		//nΪ1,1�Ľ׳�Ϊ1������1
		if(n==1) {
			return 1;
		}
		
		//���򣬷��� n*(n-1)!
		return n*f(n-1);
	}

}







