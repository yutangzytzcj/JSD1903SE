package cn.tedu.string;

public class TrimDemo {
	public static void main(String[] args) {
		
		/*
		 * trim():String
		 * ȥ���ַ�����ͷ�ͽ�β���ֵĿհ�
		 */
		String str = "      hello   world    ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
	}

}
