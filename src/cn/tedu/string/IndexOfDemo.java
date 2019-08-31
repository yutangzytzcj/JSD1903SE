package cn.tedu.string;
/**
 * indexOf(String str):int  获取子字符串在当前字符串中
 * 第一次出现的下标;
 * 若指定的字符串不存在，返回-1
 * 
 * indexOf(String str,int fromIndex):int
 * @author ta
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		            //0123456789
		String str = "thinking in java";
		//获取子串 in 在str中第一次出现的下标
		int index = str.indexOf("in");
		System.out.println(index);
		
		
		/*
		 * 找出子串从指定位置开始第一次出现的下标
		 * indexOf(String str,int fromIndex):int
		 * 快捷键： ALT+/ 
		 */
		index = str.indexOf("in",index+1);
		System.out.println(index);
		
		/*
		 * lastIndexOf(String str):int
		 * 获取指定字符串在当前字符串中最后一次出现的下标
		 */
		index = str.lastIndexOf("in");
		System.out.println(index);
		
	}

}








