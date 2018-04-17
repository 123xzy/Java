/*Because class loading initializes the static final, 
 *it has the same value in both instances of WithFinalFields,
 *whereas the regular final’s values are different for 
 *each instance. 
 */
package reusing_classes_7;

class WithFinal{
	private static int count;
	final int i = count++;
	static final int j = count++;
}
public class Ex_18 {
	public static void main(String[]args) {
		WithFinal w1 = new WithFinal();
		System.out.println(w1.i);
		System.out.println(w1.j);
		WithFinal w2 = new WithFinal();
		System.out.println(w2.i);
		System.out.println(w2.j);
	}
}
