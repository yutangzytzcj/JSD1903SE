package cn.tedu.string;

public class ToUpper_LowerCaseDemo {
	public static void main(String[] args) {
		String str = "i �� JAva";
		/*
		 * toUpperCase():���ַ����е�Ӣ��ת��Ϊ��д
		 */
		str = str.toUpperCase();
		System.out.println(str);
		
		/*
		 * toLowerCase():���ַ����е�Ӣ��ת��ΪСд
		 */
		str = str.toLowerCase();
		System.out.println(str);
	}

}
