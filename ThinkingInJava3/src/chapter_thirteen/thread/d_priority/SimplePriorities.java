package chapter_thirteen.thread.d_priority;

/**
 * 线程里的优先级，是很不靠谱的东西，尽量不用的好
 * 基于操作系统，windows 里面有7个级别，java中有10个
 * 在这个Demo真心看不出来什么
 * @author Administrator
 *
 */
public class SimplePriorities extends Thread{
	
	private int countDown = 5;
	private volatile double d = 0;
	//constructor
	public SimplePriorities(int priority){
		setPriority(priority);
		start();
	}
	//输出
	@Override
	public String toString(){
		return super.toString()+":" +countDown;
	}
	@Override
	public void run(){
		while(true){
			for(int i =1;i<10000000;i++){
				d = d +(Math.PI+Math.E)/(double)i;
			System.out.println(this);
			if(--countDown == 0){
				return;
			}
			}
		}
	}
	//test
	public static void main(String args[]){
		new SimplePriorities(Thread.MAX_PRIORITY);
		for(int i = 0;i<5;i++){
			new SimplePriorities(Thread.MIN_PRIORITY);
		}
	}
}
