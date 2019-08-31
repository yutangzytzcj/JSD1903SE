package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写程序计算商品促销日期
 * 
 * 程序启动后要求输入商品的生产日期:yyyy-MM-dd
 * 然后再输入保质期的天数。
 * 经过程序计算输出该商品促销日期，格式同上。
 * 
 * 促销日计算规则:商品过期日前两周的周三
 * @author ta
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期:");
		String dateStr = scanner.nextLine();
		
		System.out.println("请输入保质期的天数:");
		int days = Integer.parseInt(scanner.nextLine());
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//计算过期日
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//促销日
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		
		date = calendar.getTime();
		String line = sdf.format(date);
		System.out.println("促销日为:"+line);
	}
}








