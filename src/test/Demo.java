package test;

public class Demo {
	// 怎么检查一个字符串只包含数字？
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("0002321"));
		byte by=12;
		long l=by;
		System.out.println(rev("yutang"));
		System.out.println(4|7);  //  7 或，一真必真；
		 System.out.println(7|8);   // 15 
         System.out.println(7&8);   //0 
         System.out.println(2&8);    // 一假必假
         System.out.println(2|8);    //10;
         System.out.println(3|9);    //11
         System.out.println(3&9);   // 1
         System.out.println(3|10);  //11
         System.out.println(3&10);  //2
	}

	public static boolean check(String str) {
		try {
			//  也可以使用正则表达式对比
			int a = Integer.parseInt(str);
			System.out.println("只包含数字"+a);
			return true;
		} catch (Exception e) {
			System.out.println("还有其他");
			return false;

		}
	}
	//  反转字符串的方法。不使用StringBuffer;
	static String rev(String str) {
		String re="";
		for(int i=str.length()-1;i>=0;i--) {
			re=re+str.charAt(i);
		}
		
		return re;
	}
}