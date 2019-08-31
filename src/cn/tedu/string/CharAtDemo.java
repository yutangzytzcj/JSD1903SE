package cn.tedu.string;

public class CharAtDemo {
	public static void main(String[] args) {
//		String str = "thinking in java";
		/*
		 * 获取字符串中下标为9处的字符
		 * charAt(int index):char
		 * 获取指定索引处的字符
		 */
//		char c = str.charAt(9);
//		System.out.println(c);
		
		
		/*
		 * 判断字符串是否是回文
		 */
		String str = "上海自来水来自海上";
		boolean flag = false;
		
		for(int i=0;i<str.length()/2;i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2) {
				System.out.println("不是回文");
				flag = true;
				break;
			}
		}
		if(!flag) { // !flag 等同于flag为false
			System.out.println("是回文");
		}
		
		//。。。。
		
		
		
		
		
	}

}
