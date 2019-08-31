package lambda;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
			
        };
        Runnable r2 = ()->{
			System.out.println("hello !Welcome to Coding World");
		};
		Runnable r3 
		= ()->System.out.println("hello");
	}

}
