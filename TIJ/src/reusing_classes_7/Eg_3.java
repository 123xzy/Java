package reusing_classes_7;
import net.xzy.Print;
class Cleanser{
	private String s="Cleanser";
	public void append(String a) {s+=a;}
	public void dilute() {append("dilute()");}
	public void apply() {append("apply()");}
	public void scrub() {append("scrub()");}
	public String toString() {return s;}
	public static void main(String[]args) {  
		Cleanser x=new Cleanser();
		x.dilute();x.apply();x.scrub();
		Print.print(x);
	}
}
public class Eg_3 extends Cleanser {

	public void scrub() {
		append("Detergent.scrub()");
		super.scrub();
	}
	public void foam() {append("foam()");}
	public static void main(String[]args) {
		Eg_3 x=new Eg_3();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		Print.print(x);
		Print.print("Testing base class:");
		Cleanser.main(args);
	}
}
