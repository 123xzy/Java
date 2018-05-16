package net.xzy;

import java.io.*;

/**
 * 读取二进制文件
 * @author xzy
 *
 */
public class BinaryFile {
	public static byte[] read(File bFile)throws IOException{
		BufferedInputStream bf = new BufferedInputStream(
			new FileInputStream(bFile));
		try {
			byte[] data = new byte[bf.available()];
			bf.read(data);
			return data;
		}finally {
			bf.close();
		}
	}
	public static byte[] read(String bfile)throws IOException{
		return read(new File(bfile).getAbsoluteFile());
	}
}
