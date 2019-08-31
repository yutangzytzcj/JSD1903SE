package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ���԰���ָ�������ڸ�ʽ��Date��String֮���໥ת��
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
		 * �����������ڰ���SDFָ�������ڸ�ʽת��
		 * Ϊһ���ַ��������ء�
		 */
		String str = sdf.format(now);
		System.out.println(str);
		
	}
}







