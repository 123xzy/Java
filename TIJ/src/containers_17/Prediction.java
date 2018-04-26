package containers_17;

import java.util.*;

public class Prediction {
	private static Random random = new Random(47);
	private boolean shadow = random.nextDouble() > 0.5;
	public String toString() {
		if(shadow)
			return "six more weeks of winter!";
		else 
			return "Early Spring!";
	}
}
