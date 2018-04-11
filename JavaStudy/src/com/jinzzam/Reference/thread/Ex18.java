package com.youjin.thread;

public class Ex18 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;

	Thread th;

	Ex18(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}

	@Override
	public void run() {
		String name = th.getName();

		while (!stopped) {
			if (!suspended) {
				System.out.println(name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(name + "- interrupted");
				}
			} else {
				Thread.yield();
			}
		}

		System.out.println(name + "- stopped");
	}

	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + "- interrupt() by suspend()");
	}

	public void resume() {
		suspended = false;
	}

	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + "-interrupt() by stop()");
	}

	public void start() {
		th.start();
	}
}
