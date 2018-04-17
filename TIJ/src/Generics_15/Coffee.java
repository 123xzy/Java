package Generics_15;
/**
 * 实现net.xzy.Generator接口
 * @author xzy
 *
 */
public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}
