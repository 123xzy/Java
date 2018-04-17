package arrays_16;
import java.util.*;
import static net.xzy.Print.*;
/**
 * 数组与其他容器类区别有三方面：效率、类型和保存基本类型的能力
 * 但是自动包装机制的出现，容器也能用于基本类型中，数组的优势只剩效率
 * @author xzy
 *
 */
class BerylliumSphere{
	private static long counter;
	private final long id = counter++;
	public String toString() {	return "Sphere " + id;	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i = 0;i < 5;i++)
			spheres[i] = new BerylliumSphere();
		print(Arrays.toString(spheres));
		print(spheres[4]);
		List<BerylliumSphere> spheresList =
				new ArrayList<BerylliumSphere>();
		for(int i = 0;i < 5;i++)
			spheresList.add(new BerylliumSphere());
		print(spheresList);
		print(spheresList.get(4));
		
		int[] integers = {0,1,2,3,4,5};
		print(Arrays.toString(integers));
		print(integers[4]);
		
		List<Integer> intList = new ArrayList<Integer>(
				Arrays.asList(0,1,2,3,4,5));
		intList.add(97);
		print(intList);
		print(intList.get(4));
	}
}
