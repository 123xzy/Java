package containers_17;

import java.lang.reflect.Constructor;
import java.util.*;
import static net.xzy.Print.*;

public class SpringDetector {
	public static <T extends Groundhog>
	void detectSpring(Class<T> type) throws Exception{
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = 
				new HashMap<Groundhog,Prediction>();
		for(int i = 0;i < 10;i++)
			map.put(ghog.newInstance(i), new Prediction());
		print("map = " + map);
		Groundhog groundhog = ghog.newInstance(3);
		print("looking up prediction for " + groundhog);
		if(map.containsKey(groundhog))
			print(map.get(groundhog));
		else
			print("key not found: " + groundhog);
	}
	public static void main(String[] args) throws Exception{
		detectSpring(Groundhog.class);
	}
}
