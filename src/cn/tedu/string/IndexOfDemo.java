package cn.tedu.string;
/**
 * indexOf(String str):int  ��ȡ���ַ����ڵ�ǰ�ַ�����
 * ��һ�γ��ֵ��±�;
 * ��ָ�����ַ��������ڣ�����-1
 * 
 * indexOf(String str,int fromIndex):int
 * @author ta
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		            //0123456789
		String str = "thinking in java";
		//��ȡ�Ӵ� in ��str�е�һ�γ��ֵ��±�
		int index = str.indexOf("in");
		System.out.println(index);
		
		
		/*
		 * �ҳ��Ӵ���ָ��λ�ÿ�ʼ��һ�γ��ֵ��±�
		 * indexOf(String str,int fromIndex):int
		 * ��ݼ��� ALT+/ 
		 */
		index = str.indexOf("in",index+1);
		System.out.println(index);
		
		/*
		 * lastIndexOf(String str):int
		 * ��ȡָ���ַ����ڵ�ǰ�ַ��������һ�γ��ֵ��±�
		 */
		index = str.lastIndexOf("in");
		System.out.println(index);
		
	}

}








