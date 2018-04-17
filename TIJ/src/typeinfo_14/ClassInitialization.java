package typeinfo_14;
import java.util.*;
/**
 * 类字面常量:提供另一种方法生成Class对象的引用
 * 这样做更加安全、简单，因为在编译时就会受到检查
 * 对于基本数据类型的包装器类，还有一个标准字段TYPE
 * 在使用.class创建对Class对象的引用，不会自动初始化该Class对象
 * @author xzy
 */

class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = 
			ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2{
	static int staticNonFinal = 147;
	static {
		System.out.println("Initailizing Initable2");
	}
}

class Initable3{
	static int staticNonFinal = 47;
	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) throws Exception{
		/**
		 * .class 获得对对象的引用，不会发生初始化
		 */
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		/**
		 * 如果是static final是编译期常量，那在类未初始化之前就可以读取，如staticFinal
		 * 但是虽然是static和final，还不足以保证这种行为，如staticFinal2，强制初始化才能读取
		 * 如果不是final，那就必须链接(为这个域分配空间)和初始化(初始化该存储空间)，如staticNonFinal
		 */
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		/**
		 * .forName立即就初始化了
		 */
		Class initable3 = Class.forName("typeinfo_14.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}	
