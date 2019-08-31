package cn.tedu.object;

public class ToStringDemo01 {
	public static void main(String[] args) {
		int[] ary = new int[3];
		System.out.println(ary);
		
		Person person = new Person();
		person.name = "tom";
		person.age = 23;
		
		System.out.println(person);
		
		/*
		 * String类中对toString（）进行了重写
		 * 重写之后的作用：将字符串的内容输出
		 */
		String str = "hello";
		System.out.println(str);  //hello
		
		StringBuilder builder = 
				new StringBuilder(str);
		System.out.println(builder); //
		
		
		
		
	}

}
