package cn.tedu.object;

public class StudentTest {
	public static void main(String[] args) {
		//����2��Student������бȽ�
		Student student = 
				new Student(1001, "jack", 28);
		System.out.println(student.hashCode());
		Student student2 = 
				new Student(1001, "jack", 28);
		System.out.println(student2.hashCode());
		boolean flag = student.equals(student2);
		System.out.println(flag);
	}

}
