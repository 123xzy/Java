package net.xzy;

import java.util.*;

/**
 * Map适配器现在可以使用各种不同的Generator，Iterator和常量的组合来填充Map初始化对象
 * @author xzy
 *
 */
public class MapData<K,V> extends LinkedHashMap<K, V> {
	
	public MapData(Generator<Pair<K, V>> generator,int quantity){
		for(int i = 0;i < quantity; i++) {
			Pair<K, V> pair = generator.next();
			put(pair.key, pair.value);
		}
	}
	
	public MapData(Generator<K> generatorK,Generator<V> generatorV,int quantity) {
		for(int i = 0;i < quantity;i++) {
			put(generatorK.next(),generatorV.next());
		}
	}
	
	public MapData(Generator<K> generatorK,V value,int quantity) {
		for(int i = 0;i < quantity;i++) {
			put(generatorK.next(), value);
		}
	}
	
	public MapData(Iterable<K> generatorK,Generator<V> generatorV) {
		for(K key : generatorK) {
			put(key, generatorV.next());
		}
	}
	
	public MapData(Iterable<K> generatorK,V value) {
		for(K key : generatorK) {
			put(key, value);
		}
	}
	
	public static <K,V>MapData<K, V> 
	map(Generator<Pair<K, V>> generator,int quantity){
		return new MapData<K,V>(generator,quantity);
	}
	
	public static <K,V>MapData<K,V>
	map(Generator<K> generatorK,Generator<V> generatorV,int quantity){
		return new MapData<K,V>(generatorK,generatorV,quantity);
	}
	
	public static <K,V>MapData<K, V>
	map(Generator<K> generatorK,V value,int quantity){
		return new MapData<K,V>(generatorK, value,quantity);
	}
	
	public static <K,V>MapData<K, V>
	map(Iterable<K> generatorK,Generator<V> generatorV){
		return new MapData<K,V>(generatorK,generatorV);
	}
	
	public static <K,V>MapData<K, V>
	map(Iterable<K> generatorK,V value){
		return new MapData<K,V>(generatorK,value);
	}
}
