package io_18;

import java.awt.Frame;
import java.io.*;

/**
 * 读写随机访问文件
 * @author xzy
 *
 */
public class UsingRandomAccessFile {
	static String file = "src//io_18//rtest.dat";
	static void display() throws IOException{
		RandomAccessFile rFile = new RandomAccessFile(file, "r");
		for(int i=0;i<7;i++)
			System.out.println(
				"value " + i + ": " + rFile.readDouble());
		System.out.println(rFile.readUTF());
		rFile.close();
	}
	public static void main(String[] args) throws IOException{
		RandomAccessFile rFile = new RandomAccessFile(file, "rw");
		for(int i=0;i<7;i++)
			rFile.writeDouble(i*1.414);
		rFile.writeUTF("the end of file");
		rFile.close();
		display();
		rFile = new RandomAccessFile(file, "rw");
		rFile.seek(5*8);
		rFile.writeDouble(47.001);
		rFile.close();
		display();
	}
}
