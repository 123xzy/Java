package HoldingYourObjects_11;
import java.util.*;
/*
 * 使用泛型防止在编译期将错误类型的对象防止在容器中
 */
public class ApplesAndOrangesWithGenerics {
	public static void main(String[]args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0;i < 3;i++)
			apples.add(new Apple());
		
		//apples.add(new Orange());
		
		//类型转换也不是必需的了，因为list知道他保存的是什么类型，因此get()时执行了转型
		for(int i = 0;i < apples.size();i++)
			System.out.println(apples.get(i).id());
		for(Apple c : apples)
			System.out.println(c.id());
	}
}
