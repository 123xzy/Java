package HoldingYourObjects_11;
import java.util.*;

class Gerbil{
	private final int gerbilNumber;
	Gerbil(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	public String toString() {
		return "gerbil" + gerbilNumber;
	}
	public void hop() {
		System.out.println(this + " is hopping");
	}
}

public class Ex_1 {
	public static void main(String[]args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0;i < 10;i++)
			gerbils.add(new Gerbil(i));
		for(Gerbil g : gerbils)
			g.hop();
	}
}
