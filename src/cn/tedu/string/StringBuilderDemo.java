package cn.tedu.string;
/**
 * StringBuilder��Stringһ�� ���ײ�ʹ���ַ�����ʵ�ֵ�
 * StringBuilder���ַ������ǿɱ��
 * StringBuilder()�����������ַ����鳤��Ĭ����16��׷��
 * д���������������������
 * StringBuilder(String)
 * 
 * append(String):��ͬһ�������н���ƴ��
 * @author ta
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "a";
		
		//builder�����г�ʼ������Ϊ���ַ���
//		StringBuilder builder = 
//			new StringBuilder();
		//builder�����г�ʼ������Ϊ��a��
		StringBuilder builder2 = 
				new StringBuilder(str);
		
		/*
		 * ��str������׷�ӡ�bc��
		 */            //123456
		builder2.append("helloworld");
		String dest = builder2.toString();
		System.out.println(dest);
		
		/*
		 * delete(int start,int end)
		 * ɾ����start��ʼ��end�������ַ�
		 * ��ͷ����β
		 */
		builder2.delete(1, 6);
		dest = builder2.toString();
		System.out.println(dest);
		
		/*
		 * insert(int index,String str)
		 * ���������ַ������뵽indexλ��
		 * aworld-->amy in the world
		 * 
		 */
		builder2.insert(1, "my in the ");
		dest = builder2.toString();
		System.out.println(dest);
		
		
		/*
		 * replace(int start,int end,String replacement)
		 * ʹ�ø������ַ����滻start-end֮����ַ���
		 * amy in the world-->amy and jack world
		 * 0123456789
		 */
		builder2.replace(4, 10, "and jack");
		dest = builder2.toString();
		System.out.println(dest);
		
		/*
		 * reverse()
		 * ��StringBuilder�е����ݽ��з�ת
		 */
		StringBuilder builder = 
					new StringBuilder("abcdef");
		builder.reverse();
		dest = builder.toString();
		System.out.println(dest);
		
		/*
		 * �����ж�--reverse()
		 */
		String input = "�Ϻ���ˮ���Ժ���";
		StringBuilder builder3 = 
					new StringBuilder(input);
		builder3.reverse();
		String reverseStr = builder3.toString();
		
		//�Ƚ�input��reverseStr�������Ƿ����,ʹ��equals
		if(input.equals(reverseStr)) {
			System.out.println("�ǻ���");
		}else {
			System.out.println("���ǻ���");
		}
		
		
		
	}

}







