package cn.tedu.regex;

import java.util.Scanner;
/**
 * ������ע��㣺
 * 	1.java�е�\�������е�\����ת���ַ�����ͻ��Ӧʹ��\\
 * 	2.��Ҫʹ�������е�һЩ�����ַ��ı��⣬��Ҫ����ת��
 * 	3.ͨ��String�е�matches(regex)���ַ�����������У��
 * @author ta
 *
 */
public class EmailRegexDemo {
	public static void main(String[] args) {
		//ע��ת��
		String regex = "\\w+@\\w+(\\.\\w+)+";
		System.out.println("���������䣺");
		Scanner sc = new Scanner(System.in);
		
		String mail = sc.next();
		//У�������Ƿ���ȷ
		boolean flag = mail.matches(regex);
		if(flag) {
			System.out.println("�����ʽ��ȷ");
		}else {
			System.out.println("�����ʽ����");
		}
		sc.close();
	}

}








