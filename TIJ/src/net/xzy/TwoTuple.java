package net.xzy;
/**
 * 元组将对象直接打包存储在一个单一对象中，元组的对象可以是任意不同的类型
 * 元组隐含的保持了其中元素的次序                  
 * @author xzy
 *
 * @param <A>
 * @param <B>
 */
public class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A a,B b) {	first = a;second = b;	}
	public String toString() {
		return "(" + first + "," + second + ")";
	}
}
