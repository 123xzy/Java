package String_13;
import java.io.*;
import java.util.*;
/**
 * Formatter类处理所有新的格式化功能
 * 看成翻译器，将格式化字符串和数据翻译成需要的结果
 * 创建Formatter对象需向其构造器传递信息，告诉它最终结果传到哪里
 * 
 * 这里有Bug，每次输出顺序是不同的，这是为什么
 * 
 * @author xzy
 *
 */
public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name,Formatter f) {
		this.f = f;
		this.name = name;
	}
	public void move(int x,int y) {
		f.format("%s The Turtle is at (%d,%d)\n",name,x,y);
	}
	public static void main(String[] args) {
		PrintStream outAlia = System.err;
		Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
		Turtle terry = new Turtle("Terry",new Formatter(outAlia));
		tommy.move(0, 0);
		terry.move(4, 8);
	}
}
