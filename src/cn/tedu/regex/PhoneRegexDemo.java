package cn.tedu.regex;

import java.util.Scanner;

public class PhoneRegexDemo {
	public static void main(String[] args) {
		
		System.out.println("�������ֻ��ţ�");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * �򵥰�
		 * У���û�������ֻ����Ƿ���ȷ
		 * 11λ
		 * 1 3/5/7/8 9λ��������
		 */
//		String regex = "1[3578]\\d{9}";
//		String phone = sc.nextLine();
//		//����ƥ��
//		if(phone.matches(regex)) {
//			System.out.println("��ȷ���ֻ���");
//		}else {
//			System.out.println("������ֻ���");
//		}
		
		/*
		 * �����棺
		 * 0086| +86 13.... 
		 */
		String regex = "(0086|\\+86)\\s1[3578]\\d{9}";
		String phone = sc.nextLine();
		
		//����ƥ��
		if(phone.matches(regex)) {
			System.out.println("��ȷ���ֻ���");
		}else {
			System.out.println("������ֻ���");
		}
		
		sc.close();
	}

}







