package Generics_15;
/**
 * 只能持有单一类
 * @author xzy
 *
 */
class Automobil{}

public class Holder1 {
	private Automobil a;
	public Holder1(Automobil a) {	this.a = a;	}
	Automobil get() {	return a;	}
}
