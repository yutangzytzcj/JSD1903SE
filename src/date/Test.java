package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ������գ���ʽ:yyyy-MM-dd
 * Ȼ�󾭹�����������������Ϊֹһ�����˶�����
 * �پ���������������10000��ļ�����Ϊ���죬��ʽ
 * ͬ�ϡ�
 * 
 * @author ta
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String birth = scanner.nextLine();
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthDate = sdf.parse(birth);
		
		Date now = new Date();
		
		long time = now.getTime()-birthDate.getTime();
		time = time/1000/60/60/24;
		System.out.println("��ϲ��һ������:"+time+"�죬���������!");
		
		//����10000�������
		time = birthDate.getTime()+1000L*60*60*24*10000;
		Date date = new Date(time);
		
		String line = sdf.format(date);
		System.out.println(
				"������10000��ļ�����Ϊ:"+line);
		
	}
}






