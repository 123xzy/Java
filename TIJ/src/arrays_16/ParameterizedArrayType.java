package arrays_16;
/**
 * 数组与泛型
 * 不能实例化具有参数化类型的数组
 * 例如Peel<Banana>[] peels = new Peel<Banana>[10];
 * 擦除会移除参数类型消息，而数组必须知道所持有的确切类型，以确保类型安全
 * 但是可以参数化数组本身的类型
 * @author xzy
 *
 * @param <T>
 */
class ClassParameter<T>{
	public T[] f(T[] arg) {	return arg;	}
}

class MethodParameter{
	public static <T> T[] f(T[] arg) {	return arg;	}
}

public class ParameterizedArrayType {
	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
		Integer[] integers2 = 
				new ClassParameter<Integer>().f(integers);
		Double[] doubles2 = 
				new ClassParameter<Double>().f(doubles);
		integers2 = MethodParameter.f(integers);
		doubles2 = MethodParameter.f(doubles);
	}
}
