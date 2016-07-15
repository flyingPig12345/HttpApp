package chapter_thirteen.thread.g_innerThread;

public class InnerRunnable2 {
	private int countDown = 5;
	private Thread t;
	//constructor
	public InnerRunnable2(String name){
		t = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					System.out.println(this);
					if(--countDown == 0){
						return;
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					throw new RuntimeException(e);
					}
				}
				
			}
			@Override
			public String toString(){
return Thread.currentThread().getName()+":" +countDown;
			}
			
		},name);
		t.start();
	}
}
