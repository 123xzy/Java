package io_18;

import java.util.regex.*;
import java.io.*;
import java.util.*;

/**
 * 目录过滤器
 * @author xzy
 *
 */
public class DirList {
	public static void main(String[] args) {
		File path = new File(".");
		String[] liStrings;
		if(args.length == 0)
			liStrings = path.list();
		else 
			liStrings = path.list(new DirFilter(args[0]));
		Arrays.sort(liStrings,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : liStrings)
			System.out.println(dirItem);
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir,String name) {
		return pattern.matcher(name).matches();
	}
}
