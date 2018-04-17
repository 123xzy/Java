package interfaces_9;
/*The java virtual machine zeroes the bits of the object after
it allocates storage, producing a default value for i before 
any other initialization occurs. The code calls the base-class 
constructor before running the derived-class initialization, 
so we see the zeroed value of i as the initial output. 
 
The danger of calling a method inside a constructor is when that 
method depends on a derived initialization. Before the derived-class 
constructor is called, the object may be in an unexpected state 
(in Java, at least that state is defined; this is not true with 
all languages – C++, for example). The safest approach is to set 
the object into a known good state as simply as possible, and then
perform any other operations outside the constructor
 */
abstract class BasewithPrint{
	public BasewithPrint() {print();}
	public abstract void print();
}

class DerivedwithPrint extends BasewithPrint{
	int i=47;
	public void print() {System.out.println("i = "+i);}
}
public class Ex_3 {
	public static void main(String[]args) {
		DerivedwithPrint dp = new DerivedwithPrint();
		dp.print();
	}
}
