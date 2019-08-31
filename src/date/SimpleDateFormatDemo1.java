package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以按照指定的日期格式在Date与String之间相互转换
 * @author ta
 *
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * 2019-05-29 10:35:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		/*
		 * String format(Date date)
		 * 将给定的日期按照SDF指定的日期格式转换
		 * 为一个字符串并返回。
		 */
		String str = sdf.format(now);
		System.out.println(str);
		
	}
}







