package chapter_thirteen.thread.a_easyThread;
/**
 * 线程简单的书写形式
 * 1.继承Thread 或重写runnable接口
 * 2.run（）方法写入线程运行的内容  一般run（）	方法中写的是无限的循环
 * 3.start（）方法启动线程
 * @author Administrator
 *
 */
public class ThreadTest extends Thread{

	private int countDown = 5;
	private static int threadCount = 0;
	/*
	 * constructor
	 * 调用父类的构造器，目的是在程序运行时为该线程添加名称
	 */
		public ThreadTest(){
			super("线程名称"+ ++threadCount);
		}
//	为了显示运行的顺序
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
		}
	}
	
	/*
	 * 产生5个线程，运行
	 */
	public static void main(String args[]){
		for(int i = 0;i<2;i++){
			ThreadTest t = new ThreadTest();
			t.start();
		}
	}
	
}
