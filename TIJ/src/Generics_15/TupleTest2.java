package Generics_15;
import net.xzy.*;
import static net.xzy.Tuple.*;
/**
 * 
 * @author xzy
 *
 */
public class TupleTest2 {
	static TwoTuple<String, Integer>f(){
		return tuple("Hi", 47);
	}
	static TwoTuple f2() {	return tuple("Hi", 47);	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
	}
}
