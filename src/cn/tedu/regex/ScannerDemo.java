package cn.tedu.regex;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println(i);
		
		//接收字符串
		String str = sc.nextLine();
		System.out.println(str);
		
		//使用结束，将其关闭
		sc.close();
	}

}
