package net.xzy;

/**
 * 组装Map，Pair是只读的数据传输对象
 * @author xzy
 *
 * @param <K>
 * @param <V>
 */
public class Pair<K,V> {
	public final K key;
	public final V value;
	public Pair(K k, V v) {
		key = k;
		value = v;
	}
}
