package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * ��ָ����ʱ��������ϸ�����ֵ�� ��������ֵΪ������
 * �Ǽ�ȥ��
 * @author ta
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * �鿴3��2������25���Ժ������ܵ�����������?
		 */
		//��3��
		calendar.add(Calendar.YEAR, 3);
		//��2����
		calendar.add(Calendar.MONTH, 2);
		//��25��
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
	}
}







