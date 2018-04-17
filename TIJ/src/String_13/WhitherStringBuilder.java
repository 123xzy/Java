package String_13;
/**
 * @brief 从反汇编看出方法implicit()中StringBuilder是在循环内构造的，
 * 意味着每循环一次，创建一个StringBuilder对象，循环退出条件对堆栈中的操作数
 * 进行“大于或等于的整数比较运算”，这点有些不明白
 * 而explicit方法的字节码更简单、简短，只生成一个StringBuilder对象
 * @author xzy
 *
 */
public class WhitherStringBuilder {
	public String implicit(String[] fields) {
		String result = "";
		for(int i = 0;i < fields.length ;i++)
			result += fields[i];
		return result;
	}
	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for(int i = 0;i < fields.length;i++)
			result.append(fields[i]);
		return result.toString();
	}
}
