package chapter_thirteen.thread.f_join;

public class Sleeper extends Thread{
	private String name;
	private int duration;
	//constructor
	public Sleeper(String name,int sleepTime){
		super(name);
		System.out.println("创建了一个对象叫做  ： "+name);
		duration = sleepTime;
		this.name = name;
		start();
	}
	@Override
	public void run(){
		long a=0,b=0;
		try {
			a = System.currentTimeMillis();
			System.out.println(this.name+"\t等待睡眠的时间： "+duration);
			System.out.println("现成还存在吗？\t"+this.isInterrupted());
			sleep(duration);
			b = System.currentTimeMillis();
			System.out.println(this.name+"\t等待的时间是 ： "+(b-a));
			
		} catch (InterruptedException e) {
			b = System.currentTimeMillis();
			long c = b-a;
			System.out.println(this.name +"\t在第"+c+"毫秒后被打断了");
			System.out.println(getName()+ "\t线程还存在吗？\t"+ this.isInterrupted());
			return;
		}
		System.out.println(getName() +"\thas awakened");
	}
}