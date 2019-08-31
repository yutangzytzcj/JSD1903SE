package date;

import java.util.Calendar;

/**
 * int get(int field)
 * �÷������Ի�ȡָ����ʱ���������Ӧ��ֵ��
 * ʱ�����Ϊһ��intֵ�������סÿ��ֵ�ĺ��壬
 * Calendar�ṩ�˴����ĳ�����֮��Ӧ��
 * @author ta
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		//��ȡ�� �´�0��ʼ��0��ʾ1�£�1��ʾ2��
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * ��ȡ��
		 * ��"��"��ص�ʱ�����:
		 * DAY_OF_MONTH:���е���
		 * DAY_OF_WEEK:���е���
		 * DAY_OF_YEAR:���е���
		 * 
		 * DATE:���е��졣��DAY_OF_MONTHһ��
		 */
		int day = calendar.get(Calendar.DATE);

		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day);
		System.out.println(h+":"+m+":"+s);
		
		
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+days+"��");
		
		days = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("��������"+data[days-1]);
		
		//��ȡָ��ʱ���������������ֵ
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_YEAR);
		System.out.println("����һ��"+days+"��");
		
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_MONTH);
		System.out.println("����һ��"+days+"��");
	}
}








