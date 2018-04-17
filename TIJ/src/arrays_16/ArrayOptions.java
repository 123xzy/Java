package arrays_16;
import java.util.*;
import static net.xzy.Print.*;
/**
 * 初始化数组的各种方法
 * @author xzy
 *
 */
public class ArrayOptions {
	public static void main(String[] args) {
		BerylliumSphere[] aSpheres;
		BerylliumSphere[] bSpheres = new BerylliumSphere[5];
		print("bSpheres: " + Arrays.toString(bSpheres));
		BerylliumSphere[] cSpheres = new BerylliumSphere[4];
		for(int i = 0; i < cSpheres.length;i++)
			if(cSpheres[i] == null)
				cSpheres[i] = new BerylliumSphere();
		BerylliumSphere[] dSpheres = {	new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()
		};
		aSpheres = new BerylliumSphere[] {
				new BerylliumSphere(),new BerylliumSphere(),
		};
		print(aSpheres.length);
		print(bSpheres.length);
		print(cSpheres.length);
		print(dSpheres.length);
		aSpheres = dSpheres;
		print(aSpheres.length);
		
		int[] e;
		int[] f = new int[5];
		print(Arrays.toString(f));
		int[] g = new int[4];
		for(int i = 0;i < g.length;i++)
			g[i] = i*i;
		int[] h = {11,47,93};
		print(f.length);
		print(g.length);
		print(h.length);
		e = h;
		print(e.length);
		e = new int[] {1,2};
		print(e.length);
	}
}
