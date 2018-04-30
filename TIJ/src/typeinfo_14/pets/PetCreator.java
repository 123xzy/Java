package typeinfo_14.pets;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 随机创建不同类型的宠物，并且可以创建宠物的数组和List
 * 为了使该工具适应不同的实现，将其定义为抽象类
 * @author xzy
 */
public abstract class PetCreator {
	private Random random = new Random(47);
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet() {
		int n = random.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		}catch (InstantiationException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for(int i = 0;i < size;i++)
			result[i] = randomPet();
		return result;
	}
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
}
