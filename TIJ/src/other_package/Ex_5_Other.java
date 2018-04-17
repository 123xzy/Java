package other_package;
import access_control_6.Ex_5;
public class Ex_5_Other {

	public Ex_5_Other() {
		Ex_5 test=new Ex_5();
		test.a=1;
		//test.b=2;
		//test.c=3;
		//can't access:private,protected,package
		test.f1();
	}
}
