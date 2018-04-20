package holdingobjects_11;

import java.util.*;

/*
 * 四种方法展示怎么添加一组元素
 */
public class AddingGroups {
	public static void main(String[]args) {
		//Arrays.asList 接受一个数组或者一个用逗号分隔的元素列表(使用可变参数)，并将其转换成一个list对象
		Collection<Integer> collection = new ArrayList<Integer> (Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		
		//将Arrays.asList输出作为List，但其底层表示是数组，不能调整尺寸，试图使用add和delete时会出错
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		//将编号为1的元素置换为99
		list.set(1,99);
		//list.add(21);
		System.out.println(collection);
		System.out.println(list);
	}
	
}
