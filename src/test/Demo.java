package test;

public class Demo {
	// ��ô���һ���ַ���ֻ�������֣�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("0002321"));
		byte by=12;
		long l=by;
		System.out.println(rev("yutang"));
		System.out.println(4|7);  //  7 ��һ����棻
		 System.out.println(7|8);   // 15 
         System.out.println(7&8);   //0 
         System.out.println(2&8);    // һ�ٱؼ�
         System.out.println(2|8);    //10;
         System.out.println(3|9);    //11
         System.out.println(3&9);   // 1
         System.out.println(3|10);  //11
         System.out.println(3&10);  //2
	}

	public static boolean check(String str) {
		try {
			//  Ҳ����ʹ��������ʽ�Ա�
			int a = Integer.parseInt(str);
			System.out.println("ֻ��������"+a);
			return true;
		} catch (Exception e) {
			System.out.println("��������");
			return false;

		}
	}
	//  ��ת�ַ����ķ�������ʹ��StringBuffer;
	static String rev(String str) {
		String re="";
		for(int i=str.length()-1;i>=0;i--) {
			re=re+str.charAt(i);
		}
		
		return re;
	}
}