package String_13;
/**
 * 正则表达式：
 * 以编程的方式，构造复杂的文本模式，对输入的字符串进行搜索，
 * ”如果一个字符串包含这些东西，那他就是我要找的东西“
 * 例如一个数字可能有一个负号在前面，正则表达式就是:-?
 * Java对反斜线的处理和其他语言有些不一样:其他语言中，\\ 表示我想在正则
 * 表达式中插入一个普通的反斜线，而在Java中\\ 表示我要插入一个正则表达式的
 * 反斜线，所以其后是一个特殊的字符，因此如果要表示一个数字,其他原因就是\d,
 * 而Java是\\d,如果要表示普通反斜线，那就是\\\\
 * 
 * @author xzy
 *
 */
public class IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));//+号表示可能有多个数字
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+8911".matches("-?\\d+"));
		System.out.println("+8911".matches("(-|\\+)?\\d+"));//括号表示表达式分组，+号有特殊含义，需转义
	}
}
