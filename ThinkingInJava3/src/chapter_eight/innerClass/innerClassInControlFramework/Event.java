package chapter_eight.innerClass.innerClassInControlFramework;

public abstract class Event {
//	field
	private long eventTime;
	protected final long delayTime;
	//constructor
	public Event(long delayTime){
		this.delayTime = delayTime;
		this.start();
	}
	//method
	public void start(){
		eventTime = System.currentTimeMillis()+this.delayTime;
	}
	public boolean ready(){
		return System.currentTimeMillis() >= eventTime;
	}
//	abstract method
	public abstract void action();
}
