package Generics_15;
/**
 * 擦除的问题？？？
 * @author xzy
 *
 * @param <T>
 */
class GenericBase<T>{
	private T element;
	public void set(T arg) {	arg = element;	}
	public T get() {	return element;	}
}

class Derived1<T> extends GenericBase<T>{}

class Derived2 extends GenericBase{}

//class Derived3 extends GenericBase<?>{}

public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 derived2 = new Derived2();
		Object object = derived2.get();
		derived2.set(object);
	}
}
