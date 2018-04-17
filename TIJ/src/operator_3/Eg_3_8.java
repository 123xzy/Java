package operator_3;
import java.util.*;
public class Eg_3_8 {

	public static void main(String[]args) {
		Random rand=new Random(50);
		int i=rand.nextInt(100);
		int j=rand.nextInt(100);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("i>=j is "+(i>=j));
		//System.out.println("i&&j is"+(i&&j));
	}
}
