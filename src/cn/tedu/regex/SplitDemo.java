package cn.tedu.regex;

public class SplitDemo {
	public static void main(String[] args) {
		String str="hello,world,java,web";
		//����,���ַ������зָ�
		String[] ary = str.split(",");
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
		
		/*
		 * �����ַ����е����ֽ��зָ�
		 * �����Ǽ�λ���֣�����Ϊһ���ָ���
		 */
		String str1 = "hello123world1java12ok098x";
		String[] strAry = str1.split("\\d+");
		for(int i=0;i<strAry.length;i++) {
			System.out.println(strAry[i]);
		}	
	}

}
