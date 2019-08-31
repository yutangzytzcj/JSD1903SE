package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对指定的时间分量加上给定的值， 若给定的值为负数则
 * 是减去。
 * @author ta
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 查看3年2个月零25天以后所在周的周三是哪天?
		 */
		//加3年
		calendar.add(Calendar.YEAR, 3);
		//加2个月
		calendar.add(Calendar.MONTH, 2);
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
	}
}







