package cn.tedu.regex;

import java.util.Scanner;

public class PhoneRegexDemo {
	public static void main(String[] args) {
		
		System.out.println("请输入手机号：");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 简单版
		 * 校验用户输入的手机号是否正确
		 * 11位
		 * 1 3/5/7/8 9位任意数字
		 */
//		String regex = "1[3578]\\d{9}";
//		String phone = sc.nextLine();
//		//进行匹配
//		if(phone.matches(regex)) {
//			System.out.println("正确的手机号");
//		}else {
//			System.out.println("错误的手机号");
//		}
		
		/*
		 * 升级版：
		 * 0086| +86 13.... 
		 */
		String regex = "(0086|\\+86)\\s1[3578]\\d{9}";
		String phone = sc.nextLine();
		
		//进行匹配
		if(phone.matches(regex)) {
			System.out.println("正确的手机号");
		}else {
			System.out.println("错误的手机号");
		}
		
		sc.close();
	}

}







