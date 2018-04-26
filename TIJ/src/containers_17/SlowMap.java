package containers_17;

import java.util.*;
import net.xzy.*;

/**
 * 
 * @author xzy
 *
 */
public class SlowMap<K,V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	public V put(K key, V value) {
		V oldValue = get(key);
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}else 
			values.set(keys.indexOf(key), value);
		return oldValue;
	}
	public V get(Object key) {
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
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
