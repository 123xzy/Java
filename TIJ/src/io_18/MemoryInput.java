package io_18;

import java.io.*;

/**
 * 从内存读入
 * @author xzy
 *
 */
public class MemoryInput {
	public static void main(String[] args) throws IOException{
		//BufferedInputFile.read()读入的String结果被用来创建一个StringRead
		StringReader inReader = new StringReader(BufferedInputFile.read(
				"E:\\桌面\\Java\\TIJ\\src\\io_18\\BufferedInputFile.java"));
		int c;
		while((c = inReader.read()) != -1)
			System.out.print((char)c);
	}
}
