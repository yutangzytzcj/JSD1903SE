package date;

import java.util.Date;

/**
 * java.util.Date
 * Date �����࣬��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ��
 * �㡣�ڲ�ά��һ��longֵ����ֵΪUTCʱ�䣬��ʾ����
 * ��1970��1��1�� 00:00:00����ǰDate��ʾ��ʱ��֮��
 * �������ĺ��롣
 * @author ta
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//Ĭ��ʵ������ʾ��ǰϵͳʱ��
		Date date = new Date();
		System.out.println(date);
		/*
		 * ��ȡDate�ڲ�ά���ĺ���
		 */
		long time = date.getTime();
		System.out.println(time);
		/*
		 * ����һ������ֵ��ʹ��Date��ʾ������
		 */
		date.setTime(0);
		System.out.println(date);
		
		/*
		 * Date�󲿷ַ���������Ϊ��ʱ�ģ��¿���
		 * ��Ŀ��Ҫ��ʹ����Щ������
		 */
		date.getYear();
	}
}







