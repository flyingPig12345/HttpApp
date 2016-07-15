package chapter_thirteen.thread.e_daemon;

class Daemon extends Thread{

	private Thread[] t = new Thread[10];
	//constructor
	public Daemon(){
		setDaemon(true);
		start();
	}
	
	//run
	@Override
	public void run(){
		for( int i = 0;i<t.length;i++){
			t[i] = new DaemonSpawn(i);
		}
		for( int i = 0;i<t.length;i++){
			System.out.println("t"+i+"].isDaemon()="+t[i].isDaemon());
		}
		while(true)
			yield();
	}
}

class DaemonSpawn extends Thread{
	//constructor
	public DaemonSpawn(int i){
	start();
	System.out.println("DaemonSpawn"+ i +"startd");
	}
	
	//线程run方法
	@Override
	public void run(){
		while(true){
			yield();
		}
	}
}
public class Daemons{
	public static void main(String args[]) throws InterruptedException{
		Thread d = new Daemon();
		System.out.println("d.insDaemon( = " + d.isDaemon() );
		Thread.sleep(1000);
		
	}
}