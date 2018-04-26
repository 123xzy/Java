package containers_17;

public class Groundhog2 extends Groundhog {
	public Groundhog2(int n) {	super(n);	}
	public int hashCode() {	return number;	}
	public boolean equals(Object object) {
		return object instanceof Groundhog2 && 
				(number == ((Groundhog2)object).number);
	}
}
