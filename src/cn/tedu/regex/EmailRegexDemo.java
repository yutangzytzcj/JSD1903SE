package cn.tedu.regex;

import java.util.Scanner;
/**
 * 正则中注意点：
 * 	1.java中的\和正则中的\都是转义字符，冲突，应使用\\
 * 	2.若要使用正则中的一些特殊字符的本意，需要进行转义
 * 	3.通过String中的matches(regex)对字符串进行正则校验
 * @author ta
 *
 */
public class EmailRegexDemo {
	public static void main(String[] args) {
		//注意转义
		String regex = "\\w+@\\w+(\\.\\w+)+";
		System.out.println("请输入邮箱：");
		Scanner sc = new Scanner(System.in);
		
		String mail = sc.next();
		//校验邮箱是否正确
		boolean flag = mail.matches(regex);
		if(flag) {
			System.out.println("邮箱格式正确");
		}else {
			System.out.println("邮箱格式错误");
		}
		sc.close();
	}

}








