package cn.tedu.regex;

public class BorderMatchDemo {
	public static void main(String[] args) {
		String regex = "\\w{8,10}";
		
		String str = "hello_world";
		
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}

}
