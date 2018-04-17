package Generics_15;
/**
 * 具有默认构造器的简单类，用于测试basicgenerator类
 * @author xzy
 *
 */
public class CountedObject {
	private static long counter = 0;
	private final long id = counter++;
	public long id() {	return id;	}
	public String toString() {	return "CounterObject " + id;	}
}
