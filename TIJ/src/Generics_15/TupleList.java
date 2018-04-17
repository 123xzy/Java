package Generics_15;
import java.util.*;
import net.xzy.*;
/**
 * 泛型构造复杂的模型
 * @author xzy
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 */
public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A, B, C, D>> {
	public static void main(String[] args) {	
		TupleList<Vehicle, Amphibian, String,Integer> tList =
				new TupleList<Vehicle,Amphibian,String,Integer>();
		tList.add(TupleTest.h());
		tList.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String,Integer> iFourTuple : tList)
			System.out.println(iFourTuple);
	}
}
