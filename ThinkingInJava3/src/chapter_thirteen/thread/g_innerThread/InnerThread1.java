package chapter_thirteen.thread.g_innerThread;

public class InnerThread1 {

	public int countDown = 5;
	private Inner inner;

	// inner class
	private class Inner extends Thread {

		// constructor
		Inner(String name) {
			super(name);
			start();
		}

		@Override
		public void run() {
			while (true) {
				System.out.println(this);
				if (--countDown == 0) {
					return;
				}
				try {
					sleep(10);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}

		// 重写 toString 方法
		@Override
		public String toString() {
			return getName() + ":" + countDown;
		}
	}

	// 外围类的构造器
	public InnerThread1(String name) {
		inner = new Inner(name);
	}
}
