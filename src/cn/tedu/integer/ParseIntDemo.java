package cn.tedu.integer;

public class ParseIntDemo {
	public static void main(String[] args) {
		String str = "123abc";
		//String -->int
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

}
