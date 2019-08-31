package cn.tedu.string;

public class ToUpper_LowerCaseDemo {
	public static void main(String[] args) {
		String str = "i 爱 JAva";
		/*
		 * toUpperCase():将字符串中的英文转换为大写
		 */
		str = str.toUpperCase();
		System.out.println(str);
		
		/*
		 * toLowerCase():将字符串中的英文转换为小写
		 */
		str = str.toLowerCase();
		System.out.println(str);
	}

}
