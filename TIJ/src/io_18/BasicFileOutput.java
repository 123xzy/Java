package io_18;

import java.io.*;

/**
 * 
 * @author xzy
 *
 */
public class BasicFileOutput {
	static String file = "src/io_18/BasicFileOutput.out";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(
			new StringReader(
				BufferedInputFile.read("src/io_18/BasicFileOutput.java")));
		//用BufferedWriter将其包装起来用以缓冲输入，能显著增加IO操作的性能
		PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String string;
		while((string = in.readLine()) != null)
		out.println(lineCount++ + ": " + string);
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
