package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 调整指定的时间分量为指定的值
 * @author ta
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		//调整年为2008
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		//调整月为8月
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








