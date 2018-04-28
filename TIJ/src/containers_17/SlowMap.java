package containers_17;

import java.util.*;
import net.xzy.*;

/**
 * 使用ArrayList实现Map
 * @author xzy
 *
 */
public class SlowMap<K,V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	
	/**
	 * 为了和Map接口保持一致，必须返回旧的键，或者在没有旧键的情况下返回null
	 */
	public V put(K key, V value) {
		V oldValue = get(key);
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}else 
			values.set(keys.indexOf(key), value);
		return oldValue;
	}
	
	/**
	 * 同样为了遵循Map的规范，在键不存在的时候产生null
	 * key被用来查找表示它在keys列表的位置的数值型索引
	 * 返回的数值被用作索引产生于values列表相关联的值
	 */
	public V get(Object key) {
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	
	/**
	 * 如果要实现自己的Map，就必须同时定义Map.Entry来实现
	 */
	public Set<Map.Entry<K, V>> entrySet(){
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K,V>>();
		Iterator<K> kIterator = keys.iterator();
		Iterator<V> vIterator = values.iterator();
		while(kIterator.hasNext())
			set.add(new MapEntry<K,V>(kIterator.next(),vIterator.next())); 
		return set;
	}
	public static void main(String[] args) {
		SlowMap<String, String> map = new SlowMap<String,String>();
		map.putAll(Countries.capitals(5));
		System.out.println(map);
		System.out.println(map.entrySet());
	}
}
