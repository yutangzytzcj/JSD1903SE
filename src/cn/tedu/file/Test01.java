package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰ��Ŀ�´���t/x/a.txt
		 * Ӧ�÷ֿ�����
		 * 	1. ����Ŀ¼ - �༶Ŀ¼
		 * 	2. ��Ŀ¼�£��ٴ����ļ�
		 */
		File file = new File("t/x");
		file.mkdirs();
		
		/*
		 * File(File parent,String child)
		 * File(String parent,String child)
		 * ��ָ���ĸ�Ŀ¼�´������ļ�/Ŀ¼
		 */
		File file2 = new File(file,"a.txt");
//		File file3 = new File("t/x","a.txt");
		
		file2.createNewFile();
		
	}

}









