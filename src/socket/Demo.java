package socket;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] allOut = {25,65,87,49,35,16,24,11};
		
		int pw = 35;
		
		System.out.println(Arrays.toString(allOut));
		//将pw从allOut数组中删除
		for(int i=0;i<allOut.length;i++) {
			if(allOut[i]==pw) {
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(
						allOut, allOut.length-1);
				break;
			}
		}
		
		System.out.println(Arrays.toString(allOut));
	}
}
