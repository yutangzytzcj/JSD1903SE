package cn.tedu.object;

public class Point {
	//������� x,y
	private int x;
	private int y;
	
	//�޲ι��췽��
	public Point() {
		super();
	}
	//�вι��췽��
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//ͨ���˷�����ȡx��ֵ
	public int getX() {
		return x;
	}
	//ͨ���˷���Ϊx��ֵ
	public void setX(int x) {
		this.x = x;
	}
	//��ȡy��ֵ
	public int getY() {
		return y;
	}
	//Ϊy��ֵ
	public void setY(int y) {
		this.y = y;
	}

	//��дtoString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	/*
		1.дPoint��
			1. ˽�е�x,y����
			2. ���ɹ��е�set��get����
			3. ���ɹ��췽��
			4. ��дtoString()
		2.д�����࣬����2��point����ʹ��equals�Ƚ�
		3.��дpoint�е�equals������֮���ٴαȽϿ����
	 */
	
	@Override
	public boolean equals(Object obj) {
		//��objΪnull������false
		if(obj==null) {
			return false;
		}
		//��obj�͵�ǰ����Ϊͬһ��������true
		if(obj == this) {
			return true;
		}
		//��obj�ǲ�Ϊnull���������󣬽��������ж�
		if(obj instanceof Point) {
			Point point = (Point)obj;
			return point.x==this.x && point.y == this.y;
		}
		return false;
	}
	
	
	

}
