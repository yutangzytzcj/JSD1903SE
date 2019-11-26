package test;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="8888";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			Integer in=map.get(str.charAt(i));
			if(in==null) {
				map.put(str.charAt(i),1);
			}else {
				map.put(str.charAt(i),in=in+1);
				System.out.println("MMMMMM");
				
			}
		}
   System.out.println(map);
	}

}
