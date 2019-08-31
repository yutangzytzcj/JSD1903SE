package date;

import java.util.Calendar;

/**
 * int get(int field)
 * 该方法可以获取指定的时间分量所对应的值。
 * 时间分量为一个int值，无需记住每个值的含义，
 * Calendar提供了大量的常量与之对应。
 * @author ta
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月 月从0开始，0表示1月，1表示2月
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * 获取日
		 * 与"天"相关的时间分量:
		 * DAY_OF_MONTH:月中的天
		 * DAY_OF_WEEK:周中的天
		 * DAY_OF_YEAR:年中的天
		 * 
		 * DATE:月中的天。与DAY_OF_MONTH一致
		 */
		int day = calendar.get(Calendar.DATE);

		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day);
		System.out.println(h+":"+m+":"+s);
		
		
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+days+"天");
		
		days = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("今天是周"+data[days-1]);
		
		//获取指定时间分量所允许的最大值
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_YEAR);
		System.out.println("今年一共"+days+"天");
		
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_MONTH);
		System.out.println("当月一共"+days+"天");
	}
}








