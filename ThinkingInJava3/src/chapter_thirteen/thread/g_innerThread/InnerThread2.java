package chapter_thirteen.thread.g_innerThread;

public class InnerThread2 {
	private int countDown = 5;
	private Thread t;
	//constructor
	public InnerThread2(String name){

		//inner class from method
		t = new Thread(name){

			@Override
			public void run(){

				while(true){
					System.out.println(this);
					if( --countDown == 0){
						return;
					}
					try {
						sleep(10);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
			}

			//override toString()
			@Override
			public String toString(){
				return getName()+":" +countDown;
			}
		};
	t.start();
	}

}
