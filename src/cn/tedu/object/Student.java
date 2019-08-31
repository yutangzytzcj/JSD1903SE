package cn.tedu.object;

public class Student {
	//����
	private int id; //ѧ��
	private String name; //����
	private int age; //����
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	 
	
	
	//��дequals����
//	@Override
//	public boolean equals(Object obj) {
//		if(obj==null)
//			return false;
//		//��objָ��Ķ���͵�ǰ������ͬһ��
//		if(obj==this)
//			return true;
//		//objָ����null����������
//		if(obj instanceof Student) {
//			Student student = (Student)obj;
//			//�Ƚ϶��ߵ�ѧ��id�Ƿ����
//			return this.id == student.id;
//		}
//		return false;
//	}
	
	
	

}
