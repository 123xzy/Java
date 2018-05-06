package io_18;

import java.util.regex.*;
import java.io.*;
import java.util.*;

/**
 * File类是一个实用类库工具
 * 如果File指的是文件集，对该集合调用list()方法就会返回一个字符数组
 * 
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
			//list()接受FileNameFilter对象作为参数，用以选择list()方法的行为方式
			liStrings = path.list(new DirFilter(args[0]));
		Arrays.sort(liStrings,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : liStrings)
			System.out.println(dirItem);
	}
}

/**
 * 这个类的目的在于把accept()方法提供给list()使用
 * 使list()可以回调accept()，进而决定哪些文件可以包含在列表中
 * @author xzy
 *
 */
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	
	public boolean accept(File dir,String name) {
		return pattern.matcher(name).matches();
	}
}
