package chapter_thirteen.thread.b_yielding;

import chapter_thirteen.thread.a_easyThread.ThreadTest;

/**
 * 让步:据说能让输出平滑点   不明白
 * @author Administrator
 *
 */
public class YieldingThread extends Thread{
	//field
	private int countDown = 5;
	private static int threadCount = 0;
	
	//constructor
	public YieldingThread(){
		super(""+ ++threadCount);
	}
	@Override
	public String toString(){
		return "#"+this.getName()+":\t"+this.countDown;
	}
	@Override
	public void run(){
		while(true){
			System.out.println(this);
			if(--countDown==0){
				return;
			}
			yield();
		}
	}
	//test
		public static void main(String args[]){
			for(int i = 0;i<5;i++){
				new YieldingThread().start();;
			}
		}
}
