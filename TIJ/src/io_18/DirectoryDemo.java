package io_18;

import java.io.*;
import net.xzy.*;
import static net.xzy.Print.*;

/**
 * 
 * @author xzy
 *
 */
public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").dirs);
		for(File file : Directory.local(".", "T.*"))
			print(file);
		print("--------------------");
		for(File file : Directory.walk(".","T.*\\.java"))
			print(file);
		
	}
}
