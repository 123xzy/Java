package typeinfo_14;
import java.util.*;
/**
 * 为什么需要RTTI
 * 面对对象编程的基本目的就是让代码只操纵对基类的引用
 * @author xzy
 *
 */

/**
 * Shape接口动态绑定了draw()方法，目的就是让程序员使用泛化的shape引用来调用draw()
 * @author xzy
 *
 */
abstract class Shape{
	/**
	 * draw()在所有派生类中都会被覆盖，并且是动态绑定的，所以即使通过泛化的shape引用来调用，也能正确
	 * toString被申明为abstract，强制继承覆写该方法
	 */
	void draw() {	System.out.println(this + ".draw()");	}
	abstract public String toString();
	
	void rotate(int degrees) {
		System.out.println("Rotating " + this +
				" by " + degrees + "degrees");
	}
}

class Circle extends Shape{
	public String toString() {	return "Circle";	}
	void rotate(int degrees) {
		throw new UnsupportedOperationException();
	}
}

class Square extends Shape{
	public String toString() {	return "Square";	}
}

/**
 * 练习3：创建一个Rhomboid，并向上转型为shape，然后向下转型为Rhomboid，试着向下转型为Circle
 */
class Rhomboid extends Shape{
	public String toString() {	return "Rhomboid";	}
}

public class Shapes {
	public static void main(String[] args) {
		/**
		 * 创建具体的对象，向上转型为shape，并在之后的程序使用匿名
		 * arrays只是将shape当做object看待，但是从arrays取出来的时候转型为shape，这就是最基本的RTTI
		 * 但RTTI转型不够彻底，只知道是Shape，不够具体
		 * 但是多态机制能告诉执行那个具体的方法
		 */
		List<Shape> shapelist = Arrays.asList(new Circle(),new Square(),new Rhomboid());
		for(Shape shape : shapelist)
			shape.draw();
		
		Shape shape = new Rhomboid();
		System.out.println(shape);
		Rhomboid r = (Rhomboid)shape;
		//Circle c = (Circle)r;
		
		/**
		 * 练习4，向下转型前运用instanceof检查类型
		 * instanceof作用是判断其左边对象是否为其右边类的实例
		 */
		Circle c = null;
		if(shape instanceof Circle)
			c = (Circle)shape;
		else 
			System.out.println("shape is not a Circle");
		
		/**
		 * 练习5：实现rotate方法，判断所旋转的是不是Circle，如果是，就不执行
		 */
		for(Shape shape2 : shapelist)
			if(!(shape2 instanceof Circle))
				shape2.rotate(45);
	}
}
