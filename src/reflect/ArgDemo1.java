package reflect;

public class ArgDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     dosome("t");
     dosome("rtt","rfs","sds");
     /*
      * �䳤�������÷� ���䳤������һ��������ֻ�ܶ���һ��������ֻ����Ϊ
	 * ���������һ������ʹ�á�
	 * �߳��������ʾ���һ�����顣
      */
		
	}
public static void dosome(String... s) {
	System.out.println(s.hashCode());
}
}
