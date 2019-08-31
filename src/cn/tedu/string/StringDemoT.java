package cn.tedu.string;

public class StringDemoT {
	public static void main(String[] args) {
		String str = "a";
		for(int i=0;i<10000000;i++) {
			str += "a";
		}
		System.out.println("Ö´ÐÐ½áÊø");
	}

}
