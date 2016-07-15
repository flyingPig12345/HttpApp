package chapter_thirteen.thread.g_innerThread;

public class ThreadMethod {
	private int countDown = 5;
	private Thread t;
	private String name;

	// constructor
	public ThreadMethod(String name) {
		this.name = name;
	}

	// method
	public void runThread() {
		if (t == null) {
			// inner class from method
			t = new Thread(name) {
				// implements
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

				// override
				@Override
				public String toString() {
					return getName() + ":" + countDown;
				}
			};
			t.start();
		}
	}

}
