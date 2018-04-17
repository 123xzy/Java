package String_13;
/**
 * 将元音字母全部用_替换
 * @author xzy
 *
 */
public class Ex_9 {
	public static void main(String[] args) {
		System.out.println(Splitting.knights.replaceAll("(?i)[aeiou]","_"));
	}
}
