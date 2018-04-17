/*
 * 随机产生一个shape对象，并返回引用
 * 调用next()方法，只能得到一个通用的shape引用，不知道具体类型是什么
 */
package polymorphism_8;
import java.util.*;

public class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next() {  
		switch(rand.nextInt(2)) {
			default:
			case 0:return new Circle();//向上转型
			case 1:return new Square();
		}
	}
}
