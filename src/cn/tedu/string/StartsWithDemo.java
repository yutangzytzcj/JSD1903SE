package cn.tedu.string;

public class StartsWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		/*
		 * 判断str是否以thi开头
		 * startsWith(String):boolean
		 */
		boolean flag = str.startsWith("hink");
		System.out.println(flag);
		
		/*
		 * 判断str是否以java结尾
		 * ensWith(String):boolean
		 */
		flag = str.endsWith("injava");
		System.out.println(flag);
		
		
	}

}
