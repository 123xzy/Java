package net.xzy;
/**
 * 通过类型参数推断，再加上static方法，重写元组工具
 * @author xzy
 *
 */
public class Tuple {
	public static <A,B> TwoTuple<A, B> tuple(A a,B b){
		return new TwoTuple<A, B>(a, b);
	}
	public static <A,B,C>ThreeTuple<A, B, C> tuple(A a,B b,C c){
		return new ThreeTuple<A, B, C>(a, b, c);
	}
}
