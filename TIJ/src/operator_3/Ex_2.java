package operator_3;
class F{
		float a;
}

public class Ex_2 {

	public static void main(String[]args) {
		F f1=new F();
		F f2=new F();
		f2.a=6f;
		f1=f2;
		System.out.println(f1.a);
		f2.a=7f;
		System.out.println(f1.a);
	}
}
