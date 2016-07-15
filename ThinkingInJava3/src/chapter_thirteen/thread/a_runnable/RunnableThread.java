package chapter_thirteen.thread.a_runnable;
/**
 * 仅仅是用runnable的方式实现了下这个类
 * @author Administrator
 *
 */
public class RunnableThread implements Runnable{
	private int countDown = 5;
	//重写仅仅为了看结果方便
	@Override
	public String toString(){
		return "#" + Thread.currentThread().getName()+":"+countDown;
	}
	//线程的重写方法
	@Override
	public void run() {
		while(true){
			System.out.println(this);
			if(--countDown == 0){
				return ;
			}
		}
	}
	
	public static void main(String args[]){
		for( int i =1;i<=5;i++){
			new Thread(new RunnableThread(),""+i).start();
		}
	}

}
