package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * Calendar是一个抽象类，定义了操作时间的相关方法，
 * 常用实现类:GregorianCalendar,即：阳历
 * @author ta
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * static Calendar getInstance()
		 * 根据当前系统所在地区获取一个适用的实现类
		 * 通常返回的就是GregorianCalendar
		 */
		Calendar calendar 
			= Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Date getTime()
		 * 将当前Calendar的表示的时间一个Date实例
		 * 形式返回。
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		
		/*
		 * void setTime(Date date)
		 * 调整当前Calendar的时间为给定的Date所
		 * 表示的时间。
		 */
		calendar.setTime(date);
		
	}
}








