package operator_3;

public class Ex_10 {

	public static void main(String[]args) {
		int a=0x5555;
		int b=0xcccc;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a="+Integer.toBinaryString(a));
		System.out.println("b="+Integer.toBinaryString(b));
		System.out.println("a&b="+Integer.toBinaryString(a&b));
		System.out.println("a&b="+Integer.toString(a&b));
		System.out.println("a^b="+Integer.toBinaryString(a^b));
		System.out.println("a|b="+Integer.toBinaryString(a|b));
		System.out.println("~a="+Integer.toBinaryString(~a));
		System.out.println("~b="+Integer.toBinaryString(~b));
	}
}
