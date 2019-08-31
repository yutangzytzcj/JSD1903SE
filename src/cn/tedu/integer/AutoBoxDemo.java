package cn.tedu.integer;

public class AutoBoxDemo {
	public static void main(String[] args) {
		/*
		 * 从JDK1.5开始，java提供了自动拆装箱功能
		 * 是编译器实现的
		 * 如何实现：
		 * 	编译过程中，将Integer i = 3;替换成了
		 * 	Integer i = Integer.valueOf(3);
		 */
		
		//装箱  int -->Integer
		Integer in = Integer.valueOf(3);
		//自动装箱
		Integer in1 = 3;
		
		//拆箱
		int a = in.intValue();
		//自动拆箱
		int b = in;
		System.out.println(b);
	}

}




