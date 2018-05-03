package io_18;

import java.util.regex.*;

import net.xzy.Print;

import java.util.*;
import java.io.*;

/**
 * 能产生指定文件目录数组，基于正则表达式
 * @author xzy
 *
 */
public class Directory {
	public static File[] local(File dir,final String regex) {
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	public static File[]
			local(String path,final String regex) {
		return local(new File(path), regex);
	}
	public static class TreeInfo implements Iterable<File>{
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		public Iterator<File> iterator(){
			return files.iterator();
		}
		void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString() {
			//return "dirs: " + 
		}
	}
}
