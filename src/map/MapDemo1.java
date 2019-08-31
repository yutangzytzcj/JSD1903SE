package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map体现的结构是一个多行两列的表格。
 * 
 * 左列称为key，右列称为value。
 * Map可以通过key获取对应的value，所以我们经常将要
 * 查询的数据作为value，查询的条件作为key将他们成对
 * 的保存到Map中。
 * 
 * Map是一个接口，常用的实现类:java.util.HashMap
 * 
 * HashMap称为哈希表,散列表，使用散列算法实现的Map，当今
 * 查询速度最快的数据结构!!!
 * @author ta
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		/*
		 * Map需要分别指定key与value的类型
		 */
		Map<String,Integer> map = new HashMap<>();
		
		/*
		 * V put(K k,V v)
		 * 将给定的key-value对保存到Map中,Map有一个
		 * 要求:key不允许重复。因此使用已有的key保存
		 * value时，put方法会将该key原来的value返回，
		 * 并用新value替换。
		 */
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		//使用已有的key则是替换value操作
		map.put("语文", 66);
		System.out.println(map);
		
		/*
		 * V get(Object key)
		 * 根据给定的key获取对应的value，若给定的
		 * key在Map中不存在，则返回值为null。
		 */
		Integer value = map.get("物理");
		System.out.println(value);
		
		
		int size = map.size();
		System.out.println("size:"+size);
		/*
		 * V remove(Object key)
		 * 删除当前Map中给定的key所对应的这组键值对
		 * 返回值为这个key对应的value
		 */
		Integer old = map.remove("化学");
		System.out.println(map);
		System.out.println(old);
		/*
		 * 判断当前Map是否包含给定的key或value
		 */
		boolean ck = map.containsKey("数学");
		System.out.println("包含key:"+ck);
		
		boolean cv = map.containsValue(98);
		System.out.println("包含value:"+cv);
	}
}









