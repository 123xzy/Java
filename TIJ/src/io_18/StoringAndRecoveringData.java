package io_18;

import java.io.*;

/**
 * 
 * @author xzy
 *
 */
public class StoringAndRecoveringData {
	public static void main(String[] args) throws IOException{
		DataOutputStream outputStream = new DataOutputStream(
			new BufferedOutputStream(
				new FileOutputStream("src\\io_18\\Data.txt")));
		outputStream.writeDouble(3.1415926);
		outputStream.writeUTF("That is PI");
		outputStream.writeDouble(1.41413);
		outputStream.writeUTF("Square root of 2");
		outputStream.close();
		DataInputStream inputStream = new DataInputStream(
			new BufferedInputStream(
				new FileInputStream("src\\io_18\\Data.txt")));
		System.out.println(inputStream.readDouble());
		System.out.println(inputStream.readUTF());
		System.out.println(inputStream.readDouble());
		System.out.println(inputStream.readUTF());
	}
}
