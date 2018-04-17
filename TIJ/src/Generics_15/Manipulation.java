package Generics_15;
/**
 * 由于擦除的原因，编译器无法将obj调用f()这一需求映射到HasF拥有f()这一事实上
 * 于是我们借助泛型类，给定泛型类的边界，告知编译器只能接受遵循这个边界的类型
 * class Manipulator<T>改为class Manipulator<T extends HasF>
 * @author xzy
 *
 * @param <T>
 */
class Manipulator<T extends HasF>{
	private T obj;
	public Manipulator(T x) {	obj = x;	}
	public void manipulation() {	obj.f();	}
}
public class Manipulation {
	public static void main(String[] args) {
		HasF hasF = new HasF();
		Manipulator<HasF> manipulator =
				new Manipulator<HasF>(hasF);
		manipulator.manipulation();
	}
}
