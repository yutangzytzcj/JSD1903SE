package cn.tedu.file;

import java.io.File;

public class DeleteMulFileDemo {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰ��Ŀ�µ�aĿ¼���Ǹ��༶Ŀ¼��
		 * ˼·��
		 * 		1. ���������ʾaĿ¼������deleteFile(File)ɾ��
		 * 		2. �Զ��巽��deleteFile(File)����ɾ���ļ�/Ŀ¼
		 * 			�ڲ�ʵ�֣�
		 * 				��File�����ж�
		 * 					����Ŀ¼
		 * 						��ȡ����Ŀ������
		 * 							��������������Ŀɾ��-����delteFile(File)
		 * 					�����ļ���
		 * 						ɾ��
		 */
		//����File����
		File file = new File("a");
		DeleteMulFileDemo demo = new DeleteMulFileDemo();
		demo.deleteFile(file);
		
	}
	
	
	//ɾ��ָ�����ļ�/Ŀ¼
	public void deleteFile(File file) {
		//�ж�file�Ƿ���Ŀ¼
		if(file.isDirectory()) {
			//��ȡ������Ŀ
			File[] subs = file.listFiles();
			//������������Ŀ
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				//ɾ������Ŀ(�������ļ�/Ŀ¼)
				deleteFile(sub);
			}
		}
		//���ļ�
		file.delete();
	}

}








