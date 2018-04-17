package net.xzy;
/**
 * 为任何类创建一个Generator，只要该类具有默认的构造器
 * @author xzy
 *
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type) {	this.type = type;	}
	public T next() { 
		try {
			return type.newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}
