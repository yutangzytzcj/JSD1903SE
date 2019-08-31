package cn.tedu.regex;

public class SplitDemo {
	public static void main(String[] args) {
		String str="hello,world,java,web";
		//根据,将字符串进行分割
		String[] ary = str.split(",");
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
		
		/*
		 * 根据字符串中的数字进行分割
		 * 不论是几位数字，都作为一个分隔符
		 */
		String str1 = "hello123world1java12ok098x";
		String[] strAry = str1.split("\\d+");
		for(int i=0;i<strAry.length;i++) {
			System.out.println(strAry[i]);
		}	
	}

}
