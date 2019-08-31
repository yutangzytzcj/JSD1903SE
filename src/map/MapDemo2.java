package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * @author ta
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		System.out.println();
		/*
		 * ����key
		 * Set keySet()
		 * ����ǰMap�����е�key��һ��Set������ʽ����
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 * ����ÿ���ֵ��
		 * Set entrySet()
		 * ����ǰMap��ÿ���ֵ��������Entryʵ����
		 * ����Set���Ͻ��з���
		 * java.util.Map.Entry
		 */
		Set<Entry<String,Integer>> entrySet 
							= map.entrySet();		
		for(Entry<String,Integer> e:entrySet) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * Collection values()
		 * ����ǰMap�����е�value��һ��������ʽ���ء�
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values) {
			System.out.println("value:"+value);
		}
		
	}
}










