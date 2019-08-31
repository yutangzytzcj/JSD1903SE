package cn.tedu.string;
/**
 * String的常用构造方法
 * 	new String(String)
 * 	new String(char[] chs)
 * @author ta
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1);
		
		//new String(char[] chs)
		char[] chs = {'a','b','c'};
		String s2 = new String(chs);
		System.out.println(s2);
	}

}










