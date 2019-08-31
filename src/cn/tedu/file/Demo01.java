package cn.tedu.file;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 经典面试题：求阶乘
		 * 思路：
		 * 		1.用户输入数值
		 * 		2.自定义方法求阶乘
		 */
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		//求阶乘
		Demo01 demo01 = new Demo01();
		int result = demo01.f(n);
		System.out.println(result);
	}
	
	/*
	 * 求阶乘
	 * 阶乘：5！ = 5*4*3*2*1;
	 * 	    5! = 5*4!;
	 * 		4! = 4*3!;
	 * 		3! = 3*2!;
	 * 		2! = 2*1!;  1!即1*1 = 1;
	 */
	public int f(int n) {
		//n为1,1的阶乘为1，返回1
		if(n==1) {
			return 1;
		}
		
		//否则，返回 n*(n-1)!
		return n*f(n-1);
	}

}







