package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ����ָ����ʱ�����Ϊָ����ֵ
 * @author ta
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		//������Ϊ2008
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		//������Ϊ8��
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE,8);
		calendar.set(Calendar.HOUR_OF_DAY,20);
		calendar.set(Calendar.MINUTE,8);
		calendar.set(Calendar.SECOND,8);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_WEEK,4);
		System.out.println(calendar.getTime());
	}
}








