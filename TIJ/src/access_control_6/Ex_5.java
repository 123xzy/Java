package access_control_6;

public class Ex_5 {

	public int a;
	private int b;
	protected int c;
	int d;
	public void f1() {}
	private void f2() {}
	protected void f3() {}
	void f4() {}
	public static void main(String[]args) {
		Ex_5 test=new Ex_5();
		test.a=1;
		test.b=2;
		test.c=3;
		
		test.f1();
		test.f2();
		test.f3();
	}
}
