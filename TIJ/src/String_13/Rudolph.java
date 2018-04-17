package String_13;
/**
 * 创建正则表达式
 * . 任意字符
 * [abc] 包含abc的任意字符
 * [^abc] 除了abc之外的任意字符
 * [abcABC]包含abc或ABC的任意字符
 * [abc[hij]]任意abchij字符(合并)
 * [a-z&&[hij]]任意hij(相交)
 * 
 * @author xzy
 *
 */
public class Rudolph {

	public static void main(String[] args) {
		for(String pattern : new String[] {"Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*","R.*" })
			System.out.println("Rudolph".matches(pattern));
	}
}
