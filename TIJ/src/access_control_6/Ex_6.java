package access_control_6;
import net.xzy.Print;
class Pro{
	protected int i;
}
public class Ex_6 {
	
	public static void main(String[]args) {
		Pro test=new Pro();
		test.i=47;
		Print.print(test.i);
	}
	
}
