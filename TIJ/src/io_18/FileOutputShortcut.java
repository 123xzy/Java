package io_18;

import java.io.*;

/**
 * 
 * @author xzy
 *
 */
public class FileOutputShortcut {
	static String file = "src/io_18/FileOutputShortcut.out";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(
			new StringReader(BufferedInputFile.read("src/io_18/FileOutputShortcut.java")));
		//没必要自己去实现缓冲输入
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String string;
		while((string = in.readLine()) != null)
			out.println(lineCount++ + ": " + string);
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
