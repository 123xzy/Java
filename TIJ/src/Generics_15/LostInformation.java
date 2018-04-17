package Generics_15;
import java.util.*;
/**
 * Class.getTypeParameters()将返回一个TypeVariable对象数组
 * 但是从从输出看只有用作参数占位符的标识符
 * 由此得出在泛型代码内部，无法获得任何有关泛型参数类型的信息
 * @author xzy
 *
 */
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}

public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob,Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long,Double> particle = new Particle<Long,Double>();
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				particle.getClass().getTypeParameters()));
	}
}
