package io_18;

import java.util.regex.*;
import java.io.*;
import java.util.*;

/**
 * 匿名内部类实现DieList
 * @author xzy
 *
 */
public class DirList2 {
	public static FilenameFilter filter(final String regex) {
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		};
	}
	public static void main(String[] args) {
		File path = new File(".");
		String[] liStrings;
		if(args.length == 0)
			liStrings = path.list();
		else 
			liStrings = path.list(filter(args[0]));
		Arrays.sort(liStrings,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : liStrings)
			System.out.println(dirItem);
	}
}
