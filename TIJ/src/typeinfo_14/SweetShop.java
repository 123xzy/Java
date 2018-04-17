package typeinfo_14;
import static net.xzy.Print.*;
/**
 * Class对象:实现类型信息在运行时的表现
 * 一种称为Class对象的特殊对象，包含了类有关的信息，可用来创建类的所有常规对象
 * @author xzy
 *
 */
class Candy{
	/**
	 * static子句在类第一次被加载时执行，并打印相应的信息，告诉该类什么时候被加载
	 */
	static	{	print("Loading Candy");	}
}

class Gum{
	static {	print("Loading Gum");	}
}

class Cookie{
	static {	print("Loading Cookie");	}
}

public class SweetShop {
	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After creating Candy");
		/**
		 * forName是获取class对象引用的一种方法，把一个包含目标文件的
		 * 文本名的String作为输入参数，返回一个class对象的引用，
		 * 副作用就是类如果没有加载就加载它，
		 * 如果找不到该类，就抛出异常
		 */
		try {
			Class.forName("typeinfo_14.Gum");
		}catch(ClassNotFoundException e) {
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}
}
