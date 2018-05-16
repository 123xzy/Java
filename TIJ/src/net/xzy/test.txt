package net.xzy;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

/**
 * 自己编写一个类来帮助完成读取、修改、写出文件等功能
 * @author xzy
 *
 */
public class TextFile extends ArrayList<String> {
	public static String read(String filename) {
		StringBuilder sBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				new File(filename).getAbsoluteFile()));
			try {
				String string;
				while((string = in.readLine()) != null) {
					sBuilder.append(string);
					sBuilder.append("\n");
				}
			}finally {
				in.close();
			}
		}catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
		return sBuilder.toString();
	}
	public static void write(String filename,String text) {
		try {
			PrintWriter out = new PrintWriter(
				new File(filename).getAbsoluteFile());
			try {
				out.print(text);
			}finally {
				out.close();
			}
		}catch(IOException e) {
			throw new RuntimeException();
		}
	}
	public TextFile(String fileName,String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals(""))remove(0);
	}
	public TextFile(String fileName) {
		this(fileName, "\n");
	}
	public void write(String fileName) {
		try {
			PrintWriter out = new PrintWriter(
				new File(fileName).getAbsoluteFile());
			try {
				for(String item : this)
					out.println(item);
			}finally {
				out.close();
			}
		}catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
	public static void main(String[] args) {
		String file = read("src//net//xzy//TextFile.java");
		write("src//net//xzy//test.txt", file);
		TextFile textFile = new TextFile("src//net//xzy//test.txt");
		textFile.write("src//net//xzy//test2.txt");
		TreeSet<String> words = new TreeSet<String>(
				new TextFile("src//net//xzy//TextFile.java","\\W+"));
		System.out.println(words.headSet("a"));
	}
}
