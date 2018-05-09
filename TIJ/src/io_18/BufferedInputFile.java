package io_18;

import java.io.*;

/**
 * 缓冲输入文件
 * @author xzy
 *
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		//将产生的引用传给构造器，对文件进行缓冲
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String string;
		StringBuilder stringBuilder = new StringBuilder();
		//readLine()已经将换行符清除
		while((string = in.readLine()) != null)
			stringBuilder.append(string + "\n");
		in.close();
		return stringBuilder.toString();
	}
	public static void main(String[] args) throws IOException{
		System.out.print(read("E:\\桌面\\Java\\TIJ\\src\\io_18\\BufferedInputFile.java"));
	}
}
