package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar ������
 * Calendar��һ�������࣬�����˲���ʱ�����ط�����
 * ����ʵ����:GregorianCalendar,��������
 * @author ta
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * static Calendar getInstance()
		 * ���ݵ�ǰϵͳ���ڵ�����ȡһ�����õ�ʵ����
		 * ͨ�����صľ���GregorianCalendar
		 */
		Calendar calendar 
			= Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Date getTime()
		 * ����ǰCalendar�ı�ʾ��ʱ��һ��Dateʵ��
		 * ��ʽ���ء�
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		
		/*
		 * void setTime(Date date)
		 * ������ǰCalendar��ʱ��Ϊ������Date��
		 * ��ʾ��ʱ�䡣
		 */
		calendar.setTime(date);
		
	}
}








