package holdingobjects_11;

import static net.xzy.Print.*;
/*
 * 自己实现的stack和util包的stack发生冲突时，要使用包名防止冲突
 */
public class StackCollision {
	public static void main(String[]args) {
		holdingobjects_11.Stack<String> stack = new holdingobjects_11.Stack<String>();
		for(String s : "My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			print(stack.pop() + " ");
		print();
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for(String s : "My dog has fleas".split(" "))
			stack2.push(s);
		while(!stack2.empty())
			print(stack2.pop() + " ");
	}
}
