package cn.tedu.integer;

public class ValueOfDemo {
	public static void main(String[] args) {
		/*
		 * 构造方法
		 * Integer(int i):创建一个Integer对象内部
		 * 包装的值给i
		 */
		Integer integer = new Integer(23);
		
		/*
		 * valueOf(int i):Integer
		 * 将基本类型数据转换为包装类型
		 * 8种包装类都对toString()进行了重写
		 */
		int i = 3;
		Integer in = Integer.valueOf(i);
		System.out.println(in);
		
		double d = 3.4;
		//得到double对应的包装类型对象
		Double double1 = Double.valueOf(d);
		System.out.println(double1);
	}

}









