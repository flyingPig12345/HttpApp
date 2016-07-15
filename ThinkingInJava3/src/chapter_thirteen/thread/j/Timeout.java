package chapter_thirteen.thread.j;

import java.util.Timer;
import java.util.TimerTask;

public class Timeout extends Timer{
	
	public Timeout(int delay,final String msg){
		//super将使该线程变成后台线程
		super(true);
		//匿名类
//		TimerTask 类将在delay时间到期后执行
		this.schedule(new TimerTask(){
			public void run(){
				System.out.println(msg);
				System.exit(0);
			}
		},delay);
	}

}
