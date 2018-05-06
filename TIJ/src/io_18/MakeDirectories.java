package io_18;

import java.io.*;

/**
 * args:MakeDirectories
 * File类还可以创建新目录，查看文件特性，删除文件等操作
 * @author xzy
 *
 */
public class MakeDirectories {
	private static void usage() {
		System.err.println(
				"Usage:MakeDirectories path1 ...\n" + 
				"Creates each path\n" + 
				"Usage:MakeDirectories path1 ...\n" + 
				"Deletes each path\n" +
				"Usage:MakeDirectories -r path1 path2\n" + 
				"Renames from path1 to path2");
		System.exit(1);
	}
	private static void fileData(File file) {
		System.out.println(
				"Absolute path: " + file.getAbsolutePath() + 
				"\n Can read: " + file.canRead() + 
				"\n Can write: " + file.canWrite() + 
				"\n getName: " + file.getName() + 
				"\n getParent: " + file.getParent() + 
				"\n getPath: " + file.getPath() + 
				"\n length: " + file.length() + 
				"\n lastModified: " + file.lastModified());
		if(file.isFile())
			System.out.println("It's a file");
		else if(file.isDirectory())
			System.out.println("It's a directory");
	}
	public static void main(String[] args) {
		if(args.length < 1)usage();
		if(args[0].equals("-r")) {
			if(args.length != 3)usage();
			File old = new File(args[1]),rname = new  File(args[2]);
			//文件重命名或移动到由参数所指示的另一个完全不同的新路径上
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			return;
		}
		int count = 0;
		boolean del = false;
		if(args[0].equals("-d")) {
			count++;
			del = true;
		}
		count--;
		while(++count < args.length) {
			File file = new File(args[count]);
			if(file.exists()) {
				System.out.println(file + "exists");
				if(del) {
					System.out.println("deleting..." + file);
					file.delete();
				}
			}
			else {
				if(!del) {
					//自动产生复杂的目录路径
					file.mkdirs();
					System.out.println("created " + file);
				}
			}
			fileData(file);
		}
	}
}
