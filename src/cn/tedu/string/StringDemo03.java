package cn.tedu.string;
/**
 * �ַ����������Ǳ����õ�
 * new String("")�ǲ������õ�
 * @author ta
 *
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello";
		String s4 = new String("hello");
		String s5 = new String("hello");
		
		
		System.out.println(s1+" "+s2+" "+s3);
	}

}
