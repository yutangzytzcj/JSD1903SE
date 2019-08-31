package cn.tedu.string;
/**
 * java中字符串字面量之间的拼接，编译器在编译期会进行优化，
 * 即在.class文件中保存的是拼接后的结果
 * 
 * 字符串变量之间的拼接，编译器不会优化，底层采用new的方式创建
 * 了一个新的String对象
 * @author 
 *
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		String s3="ab";
		String s4=s1+s2;
		String s5 = "a"+"b";  
		//String s5 = "ab";  在.class文件中
		
		String s6 = s1+"b";  //ab
		
		System.out.println(s3==s6);  //false
		System.out.println(s3==s4);  //false
		System.out.println(s3==s5);  //true
	}

}
