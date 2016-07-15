package chapter_thirteen.thread.j;
/**
 * volatile 修饰的成员变量不会被编译器优化
 * @author Administrator
 *
 */
public class Semaphore_Test extends Thread{
	public volatile Semaphore semaphore;
	//constructor
	public Semaphore_Test(Semaphore semaphore){
		this.semaphore  = semaphore;
		setDaemon(true);
		start();
	}
	@Override
	public void run(){
		while(true){
			if(semaphore.available()){
				yield();
				semaphore.acquire();
				yield();
				semaphore.acquire();
				yield();
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Semaphore sem = new Semaphore();
		new Semaphore_Test(sem);
		new Semaphore_Test(sem);
		new InvariantWatcher(sem).join();
	}

}
