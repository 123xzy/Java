package operator_3;
import java.util.*;
/**模拟扔硬币
 * 
 * @author xzy
 *
 */
public class Ex_7 {

	public static void main(String[]args) {
		Random rand=new Random();
		Boolean i=rand.nextBoolean();
		System.out.println(i?"front":"reverse");
	}
}
