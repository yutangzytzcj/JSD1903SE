package cn.tedu.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改用户昵称操作
 * 
 * 程序启动后，要求用户输入用户名和新昵称
 * 然后将user.dat文件中对应该用户的昵称更新。
 * 若用户输入的用户名在user.dat中不存在，则提示查无此人
 * 
 * @author ta
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 思路
		 * 1:首先循环文件长度/100次
		 * 2:每次循环开始时先将指针移动到该条记录开始位置
		 * 3:读取32字节并转换为字符串,需要去除两边空白
		 *   这是这条记录的用户名，然后比对是否为用户输入
		 *   的，若不是则直接进入下次循环
		 * 4:若是该用户，则再次移动指针到该条记录昵称位置
		 *   然后将用户输入的昵称转换为字节并扩容至32字节
		 *   然后重写写入以覆盖原昵称达到修改昵称的目的
		 *   之后停止循环。  
		 * 5:还有一种情况，当循环完毕所有记录均读取，并
		 *   没有比对成功的用户名，则说明该用户不存在，
		 *   这时输出查无此人。  
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入新昵称:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","rw");
		
		//是否有进行过修改
		boolean updated = false;
		for(int i=0;i<raf.length()/100;i++) {
			//1移动指针到该条记录开始位置
			raf.seek(i*100);
			
			//2读取用户名
			byte[] data = new byte[32];
			raf.read(data);
			
			//3还原用户名
			String name = new String(data,"UTF-8").trim();
			if(name.equals(username)) {
				//移动指针到昵称位置
				raf.seek(i*100+64);
				
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改成功");
				updated = true;
				break;
			}
		}
		
		if(!updated) {
			System.out.println("查无此人");
		}
		
		raf.close();
		
	}
}









