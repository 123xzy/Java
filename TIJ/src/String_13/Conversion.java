package String_13;
import java.math.*;
import java.util.*;
/**
 * 最常用的Formatter类型转换，注释掉的都是转换异常
 * 所有类型对b都是合法的，即使数字为0转换成boolean也是true，其他参数只要不是null，转换结果都是true
 * @author xzy
 *
 */
public class Conversion {
	public static void main(String[] args)
	{
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a'");
		f.format("s:%s\n", u);
		f.format("b:%b\n", u);
		f.format("h:%h\n", u);
		//f.format("d:%d\n", u); //不能转换为整数型，会抛异常
		
		int v = 121;
		System.out.println("v = 121");
		f.format("c:%c\n", v);
		f.format("s:%s\n", v);
		f.format("b:%b\n", v);
		f.format("h:%h\n", v);
		f.format("x:%x\n", v);
		//f.format("f:%f\n", v);//不能转换成浮点数十进制
		//f.format("e:%e\n", v);//浮点数科学计数
		
		BigInteger w = new BigInteger("500000000000");
		System.out.println("w = new BigInteger(\"500000000000\")");
		f.format("s:%s\n", w);
		f.format("b:%b\n", w);
		f.format("h:%h\n", w);
		f.format("x:%x\n", w);
		//f.format("f:%f\n", w);
		//f.format("e:%e\n", w);
		//f.format("c:%c\n", w);
		
		double x = 179.523;
		System.out.println("x = 179.523");
		//f.format("c:%c\n", x);
		f.format("s:%s\n", x);
		f.format("b:%b\n", x);
		f.format("h:%h\n", x);
		//f.format("x:%x\n", x);
		f.format("f:%f\n", x);
		f.format("e:%e\n", x);
		
		Conversion y = new Conversion();
		System.out.println("y = new Conversion()");
		//f.format("c:%c\n", y);
		f.format("s:%s\n", y);
		f.format("b:%b\n", y);
		f.format("h:%h\n", y);
		//f.format("x:%x\n", y);
		//f.format("f:%f\n", y);
		//f.format("e:%e\n", y);
		
		boolean z= false;
		System.out.println("z = false");
		//f.format("c:%c\n", z);
		f.format("s:%s\n", z);
		f.format("b:%b\n", z);
		f.format("h:%h\n", z);
		//f.format("x:%x\n", z);
		//f.format("f:%f\n", z);
		//f.format("e:%e\n", z);
	}
}
