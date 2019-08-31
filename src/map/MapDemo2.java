package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * @author ta
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		System.out.println();
		/*
		 * 遍历key
		 * Set keySet()
		 * 将当前Map中所有的key以一个Set集合形式返回
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 * 遍历每组键值对
		 * Set entrySet()
		 * 将当前Map中每组键值对以若干Entry实例并
		 * 存入Set集合进行返回
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
		 * 将当前Map中所有的value以一个集合形式返回。
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values) {
			System.out.println("value:"+value);
		}
		
	}
}










