package cn.tedu.object;

public class Point {
	//点的属性 x,y
	private int x;
	private int y;
	
	//无参构造方法
	public Point() {
		super();
	}
	//有参构造方法
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//通过此方法获取x的值
	public int getX() {
		return x;
	}
	//通过此方法为x赋值
	public void setX(int x) {
		this.x = x;
	}
	//获取y的值
	public int getY() {
		return y;
	}
	//为y赋值
	public void setY(int y) {
		this.y = y;
	}

	//重写toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	/*
		1.写Point类
			1. 私有的x,y属性
			2. 生成公有的set和get方法
			3. 生成构造方法
			4. 重写toString()
		2.写测试类，创建2个point对象，使用equals比较
		3.重写point中的equals方法，之后再次比较看结果
	 */
	
	@Override
	public boolean equals(Object obj) {
		//若obj为null，返回false
		if(obj==null) {
			return false;
		}
		//若obj和当前对象为同一个，返回true
		if(obj == this) {
			return true;
		}
		//若obj是不为null的其他对象，进行内容判断
		if(obj instanceof Point) {
			Point point = (Point)obj;
			return point.x==this.x && point.y == this.y;
		}
		return false;
	}
	
	
	

}
