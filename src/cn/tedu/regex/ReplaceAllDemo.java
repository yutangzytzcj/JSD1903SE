package cn.tedu.regex;

public class ReplaceAllDemo {
	public static void main(String[] args) {
		/*
		 * ���ַ��������е����ֲ����滻Ϊ#NUMBER#
		 */
		String str = "hello123world1java12ok098x";
		String result = 
				str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(result);
		
		/*
		 * �����������ַ����й���
				- nnd|��ȥ
		 */
		String msg = "��ȥ�����������������˸���������"
				+ "nnd���浹ù��nndnnd";
		String regex = "(nnd|��ȥ)";
		msg = msg.replaceAll(regex, "***");
		System.out.println(msg);
	}

}






