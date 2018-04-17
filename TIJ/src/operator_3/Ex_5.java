package operator_3;

class Dog{
	String name;
	String says;
}
public class Ex_5 {

	public static void main(String[]args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		spot.name="spot";
		spot.says="Ruff!";
		scruffy.name="scruffy";
		scruffy.says="Wurf!";
		System.out.println(spot.name+":"+spot.says);
		System.out.println(scruffy.name+":"+scruffy.says);
	}
	
}
