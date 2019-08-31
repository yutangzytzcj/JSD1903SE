package cn.tedu.regex;

public class ReplaceAllDemo {
	public static void main(String[] args) {
		/*
		 * 将字符串中所有的数字部分替换为#NUMBER#
		 */
		String str = "hello123world1java12ok098x";
		String result = 
				str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(result);
		
		/*
		 * 对以下敏感字符进行过滤
				- nnd|我去
		 */
		String msg = "我去，今天天气真差，被淋了个落汤鸡，"
				+ "nnd，真倒霉，nndnnd";
		String regex = "(nnd|我去)";
		msg = msg.replaceAll(regex, "***");
		System.out.println(msg);
	}

}






