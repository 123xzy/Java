package String_13;
import static net.xzy.Print.*;
/**
 * String自带的最后一个正则表达式工具是替换
 * @author xzy
 *
 */
public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args) {
		//匹配字母f开头，后面跟着多个字母并且只替换第一个匹配的部分
		print(s.replaceFirst("f\\w+", "located"));
		//匹配三个单词中的任意一个，并且匹配所有部分
		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
