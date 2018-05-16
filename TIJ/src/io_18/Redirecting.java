package io_18;

import java.io.*;

/**
 * 重定向
 * @author xzy
 *
 */
public class Redirecting {
	public static void main(String[] args)throws IOException {
		 PrintStream console = System.out;
		 BufferedInputStream in = new BufferedInputStream(
			new FileInputStream("src//io_18//Redirecting.java"));
		 PrintStream out = new PrintStream(
			new BufferedOutputStream(
				new FileOutputStream("src//io_18//test.out")));
		 System.setIn(in);
		 System.setOut(out);
		 System.setErr(out);
		 BufferedReader bReader = new BufferedReader(
			new InputStreamReader(System.in));
		 String string;
		 while((string = bReader.readLine()) != null)
			 System.out.println(string);
		 out.close();
		 System.setOut(console);
	}
}
