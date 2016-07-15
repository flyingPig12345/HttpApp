package chapter_thirteen.thread.c_sleep;
/**
 * sleep() 休眠（时间）毫秒 
 * join()方法使调用该方法的线程在此之前执行完毕，也就是等待该方法的线程执行完毕后再往下继续执行
 * @author Administrator
 *
 */
public class SleepingThread extends Thread{
	
	private int countDown = 5;
	private static int threadCount = 0;
	
	//constructor
	public SleepingThread(){
		super("" +  ++threadCount);
		start();
	}
	@Override
	public String toString() {
		return "#"+ getName()+ ":\t"+countDown;
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(this);
			if(--countDown==0){
				return;
			}
			try {
				//休眠100毫秒
				sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//test
	public static void main(String args[]){
		for( int i = 0;i<5; i++){
			try {
//				new SleepingThread();
				new SleepingThread().join();
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
