package typeinfo_14;
import static net.xzy.Print.*;
/**
 * 展示Class的其他方法
 * 通过Class对象可以得到想要类型的所有信息
 * @author xzy
 *
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

/**
 * 练习2：添加新的interface，看程序能不能正确检测出来
 */
interface HasCPU{}

class Toy{
	//Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,HasCPU{
	FancyToy(){	super(1);	}
}

public class Toytest {
	static void printInfo(Class cc) {
		/**
		 * isInterface()判断是否是接口
		 * getName()打印全限定名
		 * getSimleName()不包含包名的类名
		 * getCanonicalName()全限定名
		 */
		print("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		print("simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		/**
		 * 创建一个Class引用，并指向FancyToy Class
		 */
		Class c = null;
		try {
			c = Class.forName("typeinfo_14.FancyToy");//参数必须是全限定名(包含包名)
		}catch(ClassNotFoundException e) {
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		/**
		 * getInterfaces()返回Class对象，表示在感兴趣的Class对象中所包含的接口
		 */
		for(Class face : c.getInterfaces())
			printInfo(face);
		/**
		 * getSuperclass()查询直接基类，所有可以在运行时发现一个对象的完整的类的继承结构
		 */
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			/**
			 * 如果注释掉默认构造器，则无法创建，会抛出异常，因为有非默认构造器的存在
			 */
			obj = up.newInstance();
		}catch(InstantiationException e) {
			print("Can't instantiate");
			System.exit(1);
		}catch(IllegalAccessException e) {
			print("Can't access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
