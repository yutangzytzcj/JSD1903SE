package cn.tedu.integer;

public class IntValueDemo {
	public static void main(String[] args) {
		/*
		 * intValue():int
		 * 包装类型-->基本类型 
		 */
		Integer integer = new Integer(12);
		//得到此对象的基本类型 -- int
		int i = integer.intValue();
		System.out.println(i);
		
		Double double1 = new Double(2.3);
		//要用于计算
		double d = double1.doubleValue();
		double x = d+3.3;
		System.out.println(x);
	}

}









