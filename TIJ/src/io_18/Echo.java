package io_18;

import java.io.*;

/**
 * 自动回显输入的每一行
 * @author xzy
 *
 */
public class Echo {
	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = stdin.readLine()) != null&&s.length()!=0)
			System.out.println(s);
	}
}
