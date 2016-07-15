package chapter_thirteen.thread.j;

public class InvariantWatcher extends Thread{
	
	private Invariant invariant;
	//constructor
	public InvariantWatcher(Invariant invariant){
		this.invariant = invariant;
		System.out.println("事件发起者 :\t"+this.invariant.getClass().getName());
//		后台线程
		setDaemon(true);
		start();
	}
	
	public InvariantWatcher(Invariant invariant,final int timeOut){
		this(invariant);
		new Timeout(timeOut, "Timed out without violating invariant");
	}
	
	public void run(){
		/**
		 * 调用事件发起者   EvenGenerator 类
		 * 
		 * 因为  EvenGenerator 类 实现了    invariant 类  的  invariant（）方法
		 * 并且将自己的对象传入了本类中，所以可以调用  EvenGenerator 类的方法    ，并且是循环调用
		 * 
		 */
		while(true){
			InvariantState state = invariant.invariant();
			//如果  invariant（） 方法返回的对象是     InvariantFailure 类的衍生类的时候，  就停止线程
			if(state instanceof InvariantFailure){
				//输出使事件停止的value
				System.out.println("Invariant violated:"+((InvariantFailure)state).value);
			System.exit(0);
			}
		}
	}

}
