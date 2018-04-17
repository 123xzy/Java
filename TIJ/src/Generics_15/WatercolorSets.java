package Generics_15;
import java.util.*;
import static Generics_15.Watercolors.*;
import static net.xzy.Print.*;
import static net.xzy.Sets.*;

public class WatercolorSets {
	public static void main(String[] args) {
		Set<Watercolors> set1 = EnumSet.range(ZINC, MAGENTA);
		Set<Watercolors> set2 = EnumSet.range(BRILLIANT_RED, VIOLET);
		print("set1: " + set1);
		print("set2: " + set2);
		print("union(set1,set2): " + union(set1, set2));
		
		Set<Watercolors> subset = intersection(set1, set2);
		print("intersection(set1,set2):" + subset);
		print("difference(set1,set2):" + difference(set1, subset));
		print("complement(set1,set2):" + complement(set1, set2));
	}
}
