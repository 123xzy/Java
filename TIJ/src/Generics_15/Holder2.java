package Generics_15;
/**
 * Holder2现在可以存储任何类型的对象，先后存储了Automobile，String，Integer三种类型
 * @author xzy
 *
 */
public class Holder2 {
	private Object a;
	public Holder2(Object a) { this.a = a;	}
	public void set(Object a) {	this.a = a;	}
	public Object get() {	return a;	}
	public static void main(String[] args) {
		Holder2  h2 = new Holder2(new Automobil());
		Automobil a = (Automobil)h2.get();
		h2.set("Not an Automobil");
		String s = (String)h2.get();
		h2.set(1);
		Integer x = (Integer)h2.get();
	}
}
