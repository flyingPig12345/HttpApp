package chapter_thirteen.thread.e_daemon;

public class SimpleDaemons extends Thread{
	public SimpleDaemons(){
		setDaemon(true);
		start();
	}
	//线程
	@Override
	public void run(){
		while(true){
			try{
				sleep(100);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
			System.out.println(this);
		}
	}
	
	//test
	public static void main(String args[]){
		for( int i = 0;i< 10;i++){
			new SimpleDaemons();
		}
	}
}
