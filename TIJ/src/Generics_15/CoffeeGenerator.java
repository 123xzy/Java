package Generics_15;
import java.util.*;

import net.xzy.*;
/**
 * 实现Generator<Coffee>接口，能随机生成不同类型的Coffee对象
 * @author xzy
 *
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
	@SuppressWarnings("rawtypes")
	private Class[] types = {	Latte.class,Mocha.class,Cappuccino.class,
			Americano.class,Breve.class,	};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int sz) {	size = sz;	}
	@SuppressWarnings("deprecation")
	public Coffee next() {
		try {
			return (Coffee)
					types[rand.nextInt(types.length)].newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		public boolean hasNext() {	return count > 0;	}
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
	public Iterator<Coffee> iterator(){
		return new CoffeeIterator();
	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0;i < 5;i++)
			System.out.println(gen.next());
		for(Coffee c : new CoffeeGenerator(5))
			System.out.println(c);
	}
}
