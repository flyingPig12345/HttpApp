package chapter_thirteen.thread.g_innerThread;

public class InnerRunnable1 {
	private int countDown = 5;
	private Inner inner;

	// inner class as field
	private class Inner implements Runnable {
		Thread t;

		// inner class constructor
		Inner(String name) {
			t = new Thread(this, name);
			t.start();
		}

		// override run()
		@Override
		public void run() {
			while (true) {
				System.out.println(this);
				if (--countDown == 0) {
					return;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
		//override toString()
		@Override
		public String toString(){
			return t.getName()+":" +countDown;
		}
	}
	//constructor
	public InnerRunnable1(String name){
		inner = new Inner(name);
	}

}
