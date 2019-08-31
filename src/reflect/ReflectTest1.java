package reflect;

import java.lang.reflect.Method;

public class ReflectTest1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class cls=Class.forName("java.lang.Boolean");
		String name = cls.getName();
		System.out.println(name);
		Method[] methods = cls.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}

}
