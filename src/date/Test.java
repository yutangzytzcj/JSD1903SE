package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入自己的生日，格式:yyyy-MM-dd
 * 然后经过程序计算输出到今天为止一共活了多少天
 * 再经过计算输出其出生10000天的纪念日为哪天，格式
 * 同上。
 * 
 * @author ta
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的生日:");
		String birth = scanner.nextLine();
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthDate = sdf.parse(birth);
		
		Date now = new Date();
		
		long time = now.getTime()-birthDate.getTime();
		time = time/1000/60/60/24;
		System.out.println("恭喜您一共活了:"+time+"天，请继续保持!");
		
		//计算10000天纪念日
		time = birthDate.getTime()+1000L*60*60*24*10000;
		Date date = new Date(time);
		
		String line = sdf.format(date);
		System.out.println(
				"您出生10000天的纪念日为:"+line);
		
	}
}






