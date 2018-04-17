package String_13;
/**
 * 通过查看java.util.regex.Pattern文档，编写一个正则表达式，检查句子是否以大写字母开头，以句号结尾
 * @author xzy
 *
 */
public class Ex_7 {
	public static boolean matches(String text) {
		return text.matches("\\p{javaUpperCase}.*\\.");
	}
	public static void main(String[] args) {
		System.out.println(matches("This is test."));
		System.out.println(matches("This is test"));
		System.out.println(matches("this is test."));
	}
}
