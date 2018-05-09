package io_18;

import java.io.*;

/**
 * 格式化的内存输入
 * @author xzy
 *
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try {
			DataInputStream inputStream = new DataInputStream(
					//getBytes()为ByteArrayInputStream提供字节数组
					new ByteArrayInputStream(
							BufferedInputFile.read(
						"E:\\桌面\\Java\\TIJ\\src\\io_18\\BufferedInputFile.java").getBytes()));
					while(true)
						System.out.print((char)inputStream.readByte());
		}catch (EOFException e) {
			// TODO: handle exception
			System.err.println("End of stream");
		}
	}
}
