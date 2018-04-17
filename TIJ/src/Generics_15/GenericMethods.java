package Generics_15;
/**
 * 泛型方法
 * 无论何时，只要能做到，就应该尽量使用泛型方法
 * 类不是泛型化的，但包含的方法可以
 * 使用泛型类，必须在创建的时候指明具体类型
 * 而使用泛型方法，通常不必指明参数类型，编译器会自动进行类型参数推断
 * @author xzy
 *
 */
public class GenericMethods {
	public<T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gMethods = new GenericMethods();
		gMethods.f(" ");
		gMethods.f(1);
		gMethods.f('x');
		gMethods.f(gMethods);
	}
}
