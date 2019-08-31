package cn.tedu.string;
/**
 * substring(int index):String
 *   从指定位置开始截取，直到字符串的末尾
 * substring(int start,int end):String
 * 	 截取从start开始到end结束之间的子字符串
 * @author ta
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
					//0123456789
		String str = "thinking in java";
		/*
		 * substring(int index)：String
		 * 从指定位置开始截取，直到字符串的末尾
		 */
		String subStr = str.substring(4);
		System.out.println(subStr);
		
		/*
		 * substring(int start,int end):String
		 * 截取从start开始到end结束之间的字符串
		 * 规约：
		 * 	java若出现2个边界值，通常都是包头不包尾
		 * 
		 */
		
		subStr = str.substring(4, 8);
		System.out.println(subStr);
		
	}

}









