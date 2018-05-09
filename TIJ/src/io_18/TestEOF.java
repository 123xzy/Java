package io_18;

import java.io.*;

/**
 * 一个一个字节读取，使用available()方法查看还有多少可供存取的字符
 * @author xzy
 *
 */
public class TestEOF {
	public static void main(String[] args) throws IOException{
		DataInputStream inputStream = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("E:\\桌面\\Java\\TIJ\\src\\io_18\\BufferedInputFile.java")));
				while(inputStream.available() != 0)
					System.out.print((char)inputStream.readByte());
	}
}
