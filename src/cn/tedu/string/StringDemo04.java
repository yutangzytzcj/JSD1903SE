package cn.tedu.string;
/**
 * java���ַ���������֮���ƴ�ӣ��������ڱ����ڻ�����Ż���
 * ����.class�ļ��б������ƴ�Ӻ�Ľ��
 * 
 * �ַ�������֮���ƴ�ӣ������������Ż����ײ����new�ķ�ʽ����
 * ��һ���µ�String����
 * @author 
 *
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		String s3="ab";
		String s4=s1+s2;
		String s5 = "a"+"b";  
		//String s5 = "ab";  ��.class�ļ���
		
		String s6 = s1+"b";  //ab
		
		System.out.println(s3==s6);  //false
		System.out.println(s3==s4);  //false
		System.out.println(s3==s5);  //true
	}

}
