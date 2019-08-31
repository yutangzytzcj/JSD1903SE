package cn.tedu.string;

public class TrimDemo {
	public static void main(String[] args) {
		
		/*
		 * trim():String
		 * 去掉字符串开头和结尾部分的空白
		 */
		String str = "      hello   world    ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
	}

}
