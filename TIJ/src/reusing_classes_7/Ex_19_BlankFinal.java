package reusing_classes_7;

class WithBlankFinal{
	private final int i;
	public WithBlankFinal(int i) {this.i = i;}
	public int geti() {
		//i = 7;
		return i;
	}
}
public class Ex_19_BlankFinal {
	public static void main(String[]args) {
		WithBlankFinal w = new WithBlankFinal(2);
		System.out.println(w.geti());
	}
}
