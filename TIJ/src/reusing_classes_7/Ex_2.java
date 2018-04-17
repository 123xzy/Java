package reusing_classes_7;

class NewEg_3 extends Eg_3{
	public  void scrub() {
		append("NewEg_3.scrub()");
		super.scrub();
	}
	public void sterilize() {append("sterilize()");}
}
public class Ex_2  {

	public static void main(String[]args) {
		NewEg_3 ne=new NewEg_3();
		ne.dilute();
		ne.scrub();
		ne.sterilize();
		System.out.println(ne);
	}
}
