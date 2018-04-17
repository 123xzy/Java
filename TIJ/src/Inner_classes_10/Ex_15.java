package Inner_classes_10;

class NoDefault{
	private int i;
	public NoDefault(int i) {	this.i = i;	}
	public void f() {	System.out.println("NoDefault.f");	}
}

class Second{
	public NoDefault get(int i) {
		return new NoDefault(i) {
			public void f() {	System.out.println("Second.get.f");	}
		};
	}
}
public class Ex_15 {
	public static void main(String[]args) {
		Second s = new Second();
		NoDefault n = s.get(47);
		n.f();
		
	}
}
