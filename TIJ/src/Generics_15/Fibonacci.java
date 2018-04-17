package Generics_15;
import net.xzy.*;
/**
 * java泛型的局限性，基本类型无法作为类型参数
 * 但是自动打包和自动拆包功能，能够方便在两者之间转换
 * @author xzy
 *
 */
public class Fibonacci implements Generator<Integer>{
	private int count = 0;
	public Integer next() {	return fib(count++);	}
	private int fib(int n) {
		if(n < 2)return 1;
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for(int i = 0;i < 18;i++)
			System.out.print(gen.next() + " ");
	}

	
}
