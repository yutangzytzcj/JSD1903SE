package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ��д���������Ʒ��������
 * 
 * ����������Ҫ��������Ʒ����������:yyyy-MM-dd
 * Ȼ�������뱣���ڵ�������
 * ������������������Ʒ�������ڣ���ʽͬ�ϡ�
 * 
 * �����ռ������:��Ʒ������ǰ���ܵ�����
 * @author ta
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String dateStr = scanner.nextLine();
		
		System.out.println("�����뱣���ڵ�����:");
		int days = Integer.parseInt(scanner.nextLine());
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//���������
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//������
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		
		date = calendar.getTime();
		String line = sdf.format(date);
		System.out.println("������Ϊ:"+line);
	}
}








