package reusing_classes_7;
import java.util.*;

import net.xzy.Print;
import net.xzy.Range;

class Value{
	int i;
	public Value(int i) { this.i = i; }
}

public class Eg_FinalData {
	private static Random rand = new Random(47);
	private String id;
	public Eg_FinalData(String id) { this.id = id; }
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	private final int i4 = rand.nextInt(20);
	static final int INT_5=rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	private final int[] a = {1,2,3,4,5,6};
	public String toString() {
		return id+":"+"i4="+i4+",INT_5="+INT_5;
	}
	public static void main(String[]args) {
		Eg_FinalData fd1 = new Eg_FinalData("fd1");
		//fd1.valueOne++;
		fd1.v2.i++;
		fd1.v1 = new Value(9);
		for(int i = 0;i < fd1.a.length;i++)
			fd1.a[i]++;
		//fd1.v2 = new value(0);
		//fd1.VAL_3 = new Value(1);
		//fd1.a = new int[3];
		Print.print(fd1);
		Print.print("Creating new FinalData");
		Eg_FinalData fd2 = new Eg_FinalData("fd2");
		Print.print(fd1); 
		Print.print(fd2);
	}
	
}
