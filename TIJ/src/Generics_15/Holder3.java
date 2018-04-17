package Generics_15;
/**
 * 泛型的主要目的就是用来指定容器要持有什么类型的对象，
 * 利用参数类型来延迟决定具体使用什么类型
 * 泛型的核心概念：告诉编译器想要使用什么类型，然后编译器帮你处理一切细节
 * @author xzy
 *
 * @param <T>
 */
public class Holder3<T> {
	private T a;
	public Holder3(T a) {	this.a = a;	}
	public void set(T a) {	this.a = a;	}
	public T get() {	return a;	}
	public static void main(String[] args) {
		Holder3<Automobil> h3 = new Holder3<Automobil>(new Automobil());
		Automobil a = h3.get();
	}
}
