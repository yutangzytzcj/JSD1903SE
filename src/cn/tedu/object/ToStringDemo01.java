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
		 * String���ж�toString������������д
		 * ��д֮������ã����ַ������������
		 */
		String str = "hello";
		System.out.println(str);  //hello
		
		StringBuilder builder = 
				new StringBuilder(str);
		System.out.println(builder); //
		
		
		
		
	}

}
