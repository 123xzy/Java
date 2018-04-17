package operator_3;

public class Ex_11 {

	public static void main(String[]args) {
		int i=0x80000000;
		System.out.println(Integer.toBinaryString(i));
		for(int j=1;j<32;j++)
		{
			i>>=1;
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
