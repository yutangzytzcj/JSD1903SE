package cn.tedu.string;

public class CharAtDemo {
	public static void main(String[] args) {
//		String str = "thinking in java";
		/*
		 * ��ȡ�ַ������±�Ϊ9�����ַ�
		 * charAt(int index):char
		 * ��ȡָ�����������ַ�
		 */
//		char c = str.charAt(9);
//		System.out.println(c);
		
		
		/*
		 * �ж��ַ����Ƿ��ǻ���
		 */
		String str = "�Ϻ�����ˮ���Ժ���";
		boolean flag = false;
		
		for(int i=0;i<str.length()/2;i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2) {
				System.out.println("���ǻ���");
				flag = true;
				break;
			}
		}
		if(!flag) { // !flag ��ͬ��flagΪfalse
			System.out.println("�ǻ���");
		}
		
		//��������
		
		
		
		
		
	}

}
