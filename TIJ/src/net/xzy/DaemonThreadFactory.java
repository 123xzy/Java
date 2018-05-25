package net.xzy;

import java.util.concurrent.*;

public class DaemonThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable run) {
		Thread thread = new Thread(run);
		thread.setDaemon(true);
		return thread;
	}
}
