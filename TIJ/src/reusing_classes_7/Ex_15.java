package reusing_classes_7;
import other_package.Ex_15_Protected;
class Derived extends Ex_15_Protected{
	public void g() {
		f();
	}
}
public class Ex_15 {

	public static void main(String[]args) {
		//new Ex_15_Protected().f();
		
		/*Outside the package, you can only access a 
		protected member inside an inherited class*/
	}
	
}
