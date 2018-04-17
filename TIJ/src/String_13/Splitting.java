package String_13;
import java.util.*;
/**
 * Stirng类自带的split方法，将字符串从正则表达式匹配的地方切开
 * 与正则表达式匹配的部分，最终都不存在了
 * @author xzy
 *
 */
public class Splitting {
	public static String knights = "Then ,when you have found the shrubbery, you must "
			+ "cut down the mightiest tree in the forest..." 
			+ "with... a herring";
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" "); //按空格来划分
		split("\\W+");//\W表示非单词字符，\w表示单词字符，将标点符号删除了，
		split("n\\W+");//字母n后面跟着多个非单词字符
	}
}
