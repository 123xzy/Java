package access_control_6;

public class Ex_5_Other {

	public Ex_5_Other() {
		Ex_5 test=new Ex_5();
		test.a=1;
		//test.b=2;can't access:private
		test.f3();
		//test.f2();
	}
}
