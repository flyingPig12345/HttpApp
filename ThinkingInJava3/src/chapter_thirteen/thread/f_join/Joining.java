package chapter_thirteen.thread.f_join;
/**
 * 这个例子不能良好的表示出sleep  被interrupt打断的效果
 * 在一个线程grumpy 在sleep() 的时候，可以通过grumpy.interrupt()打断休眠状态  
 * grumpy.isInterrupt()方法判断线程是否正在进行，如果被打断 则反悔false
 * @author Administrator
 *
 */
public class Joining {
	public static void main(String args[]){
		Joining t = new Joining();
//		t.test();
		t.test2();
	}
	/**
	 * 仅仅测试打断效果
	 */
	public void test(){
		Sleeper grumpy = new Sleeper("Grumpy",1500);
		grumpy.interrupt();
	}
	
	public void test2(){
		Sleeper 
		sleepy = new Sleeper("Sleeper",1500),
		grumpy = new Sleeper("Grumpy",1500);
		Joiner
		dopey = new Joiner("Dopey",sleepy),
		doc = new Joiner("Doc",grumpy);
		grumpy.interrupt();
	}
}



