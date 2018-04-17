package HoldingYourObjects_11;
import java.util.*;
/**
 * 查看操作系统环境变量
 * Iterable包含所有的Collection，但是Map不是Iterable类型
 * 在该例子中，entrySet()产生一个Map.Entry的元素构成的set
 * 该set是Iterable,因此可以用于foreach
 * @author xzy
 *
 */
public class EnvironmentVariables {
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " +
					entry.getValue());
		}
	}
}
