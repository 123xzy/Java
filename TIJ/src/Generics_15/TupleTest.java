package Generics_15;
import net.xzy.TwoTuple;

class Amphibian{}
class Vehicle{}

public class TupleTest {
	static TwoTuple<String,Integer>f(){
		return new TwoTuple<String,Integer>("hi",47);
	}
	static FiveTuple<Vehicle,Amphibian,String,Integer,Double>g(){
		return new FiveTuple<Vehicle,Amphibian,String,Integer,Double>(
				new Vehicle(),new Amphibian(),"hi",47,11.1);
	}
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(
				new Vehicle(), new Amphibian(), "hi", 47);
	}
	public static void main(String[] args) {
		TwoTuple<String,Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(g());
	}
}
