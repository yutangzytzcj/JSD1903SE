package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map ���ұ�
 * Map���ֵĽṹ��һ���������еı��
 * 
 * ���г�Ϊkey�����г�Ϊvalue��
 * Map����ͨ��key��ȡ��Ӧ��value���������Ǿ�����Ҫ
 * ��ѯ��������Ϊvalue����ѯ��������Ϊkey�����ǳɶ�
 * �ı��浽Map�С�
 * 
 * Map��һ���ӿڣ����õ�ʵ����:java.util.HashMap
 * 
 * HashMap��Ϊ��ϣ��,ɢ�б�ʹ��ɢ���㷨ʵ�ֵ�Map������
 * ��ѯ�ٶ��������ݽṹ!!!
 * @author ta
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		/*
		 * Map��Ҫ�ֱ�ָ��key��value������
		 */
		Map<String,Integer> map = new HashMap<>();
		
		/*
		 * V put(K k,V v)
		 * ��������key-value�Ա��浽Map��,Map��һ��
		 * Ҫ��:key�������ظ������ʹ�����е�key����
		 * valueʱ��put�����Ὣ��keyԭ����value���أ�
		 * ������value�滻��
		 */
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		//ʹ�����е�key�����滻value����
		map.put("����", 66);
		System.out.println(map);
		
		/*
		 * V get(Object key)
		 * ���ݸ�����key��ȡ��Ӧ��value����������
		 * key��Map�в����ڣ��򷵻�ֵΪnull��
		 */
		Integer value = map.get("����");
		System.out.println(value);
		
		
		int size = map.size();
		System.out.println("size:"+size);
		/*
		 * V remove(Object key)
		 * ɾ����ǰMap�и�����key����Ӧ�������ֵ��
		 * ����ֵΪ���key��Ӧ��value
		 */
		Integer old = map.remove("��ѧ");
		System.out.println(map);
		System.out.println(old);
		/*
		 * �жϵ�ǰMap�Ƿ����������key��value
		 */
		boolean ck = map.containsKey("��ѧ");
		System.out.println("����key:"+ck);
		
		boolean cv = map.containsValue(98);
		System.out.println("����value:"+cv);
	}
}









