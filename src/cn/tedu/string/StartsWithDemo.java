package cn.tedu.string;

public class StartsWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		/*
		 * �ж�str�Ƿ���thi��ͷ
		 * startsWith(String):boolean
		 */
		boolean flag = str.startsWith("hink");
		System.out.println(flag);
		
		/*
		 * �ж�str�Ƿ���java��β
		 * ensWith(String):boolean
		 */
		flag = str.endsWith("injava");
		System.out.println(flag);
		
		
	}

}
