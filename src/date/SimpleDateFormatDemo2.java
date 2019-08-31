package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date
 * @author ta
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String line = "2008-08-08 20:08:08";
		
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss"	
			);
		/*
		 * Date parse(String str)
		 * 将给定的字符串按照SDF指定的日期格式解析
		 * 为一个Date对象
		 */
		Date date = sdf.parse(line);
		System.out.println(date);
		
	}
}








