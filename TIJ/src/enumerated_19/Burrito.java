package enumerated_19;

import static enumerated_19.Spiciness.*;

/**
 * static import能够将enum带入到当前的命名空间，
 * @author xzy
 *
 */
public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree) {	this.degree = degree;	}
	public String toString() {	return "Burrito is " + degree;	}
	public static void main(String[] args) {
		System.out.println(new Burrito(NOT));
		System.out.println(new Burrito(MEDIUM));
		System.out.println(new Burrito(HOT));
	}
}
