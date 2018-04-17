package operator_3;
import operator_3.Ex_5;

public class Ex_6 {

	public static void main(String[]args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		Dog kit=new Dog();
		kit=spot;
		spot.name="spot";
		spot.says="Ruff!";
		scruffy.name="scruffy";
		scruffy.says="Wurf!";
		System.out.println(spot.name+":"+spot.says);
		System.out.println(scruffy.name+":"+scruffy.says);
		System.out.println(kit.equals(spot));
		System.out.println(spot.equals(scruffy));
	}
}
