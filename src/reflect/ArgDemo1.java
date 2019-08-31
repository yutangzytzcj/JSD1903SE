package reflect;

public class ArgDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     dosome("t");
     dosome("rtt","rfs","sds");
     /*
      * 变长参数的用法 ，变长参数在一个方法中只能定义一个，并且只能作为
	 * 方法的最后一个参数使用。
	 * 边长参数本质就是一个数组。
      */
		
	}
public static void dosome(String... s) {
	System.out.println(s.hashCode());
}
}
