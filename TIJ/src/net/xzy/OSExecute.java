package net.xzy;

import java.io.*;

public class OSExecute {
	public static void command(String command) {
		boolean err = false;
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String string;
			while((string = results.readLine()) != null)
				System.out.println(string);
			BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while((string = errors.readLine())!=null) {
				System.err.println(string);
				err = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			if(!command.startsWith("CMD /C"))
				command("CMD /C" + command);
			else 
				throw new RuntimeException();
			}
		if(err)
			throw new OSExecuteException("Errors executing " + command);
	}
}
