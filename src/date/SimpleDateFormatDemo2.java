package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��һ���ַ�������ΪDate
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
		 * ���������ַ�������SDFָ�������ڸ�ʽ����
		 * Ϊһ��Date����
		 */
		Date date = sdf.parse(line);
		System.out.println(date);
		
	}
}








