package Generics_15;
/**
 *创建一个Holder类，可以持有三个相同类型的对象，并具有读写对象的方法，以及初始化三个对象的构造器
 * @author xzy
 *
 * @param <T>
 */
class Holder4<T>
{
	private T a,b,c;
	public Holder4(T a,T b,T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void setA(T a) {	this.a = a;	}
	public void setB(T b) {	this.b = b;	}
	public void setC(T c) {	this.c = c;	}
	public T getA() {	return a;	}
	public T getB() {	return b;	}
	public T getC() {	return c;	}
}

public class Ex_4_Holder4 {
	public static void main(String[] args) {
		Holder4<String> h4 = new Holder4<String>("A","B","C");
		System.out.print(h4.getA());
		System.out.print(h4.getB());
		System.out.print(h4.getC());
	}
}
