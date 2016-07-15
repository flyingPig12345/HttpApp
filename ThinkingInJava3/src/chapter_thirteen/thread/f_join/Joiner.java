package chapter_thirteen.thread.f_join;

public class Joiner extends Thread{
	private String name;
	private Sleeper sleeper;
	//constructor
	public Joiner(String name ,Sleeper sleeper){
		super(name);
		System.out.println("创建了一个对象叫做  ： "+name);
		this.sleeper = sleeper;
		this.name = name;
		start();
	}
	//重写线程方法
	@Override
	public void run(){
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(getName() +"\tJoin completed");
	}
}