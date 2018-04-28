package containers_17;

import java.util.*;
import net.xzy.*;

/**
 * 简单的散列Map
 * @author xzy
 *
 */
public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
	static final int SIZE = 997;
	LinkedList<MapEntry<K, V>>[] buckets = 
			new LinkedList[SIZE];
	public V put(K key,V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null)
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K,V>(key, value);
		boolean found = false;
		ListIterator<MapEntry<K, V>> iterator = bucket.listIterator();
		while(iterator.hasNext()) {
			MapEntry<K, V> ipair = iterator.next();
			if(ipair.getKey().equals(key)) {
				oldValue = ipair.getValue();
				iterator.set(pair);
				found = true;
				break;
			}
		}
		if(!found)
			buckets[index].add(pair);
		return oldValue;
	}
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null)return null;
		for(MapEntry<K, V> ipair : buckets[index])
			if(ipair.getKey().equals(key))
				return ipair.getValue();
		return null;
	}
	public Set<Map.Entry<K, V>> entrySet(){
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K, V>> bucket : buckets) {
			if(bucket == null)continue;
			for(MapEntry<K, V> mpair : bucket)
				set.add(mpair);
		}
		return set;
	}
	public static void main(String[] args) {
		SimpleHashMap<String, String> mHashMap = 
				new SimpleHashMap<String,String>();
		mHashMap.putAll(Countries.capitals(10));
		System.out.println(mHashMap);
		System.out.println(mHashMap.get("ERITERA"));
		System.out.println(mHashMap.entrySet());
	}
}
