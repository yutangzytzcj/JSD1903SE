package cn.tedu.object;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
		Point point2 = new Point(10, 10);
		
		//����������бȽ�
		boolean flag = point.equals(point2); //false
		System.out.println(flag);
	}

}
