package cn.tedu.string;
/**
 * substring(int index):String
 *   ��ָ��λ�ÿ�ʼ��ȡ��ֱ���ַ�����ĩβ
 * substring(int start,int end):String
 * 	 ��ȡ��start��ʼ��end����֮������ַ���
 * @author ta
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
					//0123456789
		String str = "thinking in java";
		/*
		 * substring(int index)��String
		 * ��ָ��λ�ÿ�ʼ��ȡ��ֱ���ַ�����ĩβ
		 */
		String subStr = str.substring(4);
		System.out.println(subStr);
		
		/*
		 * substring(int start,int end):String
		 * ��ȡ��start��ʼ��end����֮����ַ���
		 * ��Լ��
		 * 	java������2���߽�ֵ��ͨ�����ǰ�ͷ����β
		 * 
		 */
		
		subStr = str.substring(4, 8);
		System.out.println(subStr);
		
	}

}









