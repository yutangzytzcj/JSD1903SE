package date;

import java.util.Date;

/**
 * java.util.Date
 * Date 日期类，其每一个实例用于表示一个确切的时间
 * 点。内部维护一个long值，该值为UTC时间，表示的是
 * 自1970年1月1日 00:00:00到当前Date表示的时间之间
 * 所经过的毫秒。
 * @author ta
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//默认实例化表示当前系统时间
		Date date = new Date();
		System.out.println(date);
		/*
		 * 获取Date内部维护的毫秒
		 */
		long time = date.getTime();
		System.out.println(time);
		/*
		 * 设置一个毫秒值，使得Date表示该日期
		 */
		date.setTime(0);
		System.out.println(date);
		
		/*
		 * Date大部分方法被声明为过时的，新开发
		 * 项目不要再使用这些方法。
		 */
		date.getYear();
	}
}







