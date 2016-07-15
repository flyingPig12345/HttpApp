package chapter_thirteen.thread.g_innerThread;
/**
 * 一个复杂的类中，他作为线程的内容可能仅仅是其一小部分，将其全部线程部分封装成一个方法进行实现，（再封装的更彻底一点，则整个类都不必继承或实现线程特性，内部类可代替其完成这些内容）
 * 而这个方法可以用内部类的形式显示，该内部类可以继承Thread 其作用专门用于线程的调用与实现
 * @author Administrator
 *	
 */
public class ThreadVariations {
	public static void main(String args[]){
		//作为属性的内部类
		new InnerThread1("InnerThread1");
		new InnerRunnable1("InnerRunnable1");
		//存在与方法中的内部类
		new InnerThread2("InnerThread2");
		new InnerRunnable2("InnerRunnable2");
		//无内部类，但将线程内容封装成了方法
		new ThreadMethod("ThreadMethod").runThread();
		
	}
}
