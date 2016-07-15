package chapter_thirteen.thread.i_AlwaysEven;
/**
 * 为了线程锁而做出的demo，实际上没什么用处
 * 线程的不稳定性就是不知道是什么时候进行你所需要的操作，就像这个demo中一样，你不知道他什么时候会达到输出的结果
 * 而当你将要应用的东西被另一个线程占用了或者删除掉了，则就会产生错误
 * @author Administrator
 *
 */
public class AlwaysEven {
	public int i;
	public void next(){i++;};
	public int getValue(){return i ;};
	public static void main(String args[]){
		final AlwaysEven ae = new AlwaysEven();
		//匿名类实现
		new Thread("Watcher"){
			//run method
			public void run(){
				//循环获取类中i的值   如果是奇数就输出
				while(true){
					int val = ae.getValue();
					if(val%2 != 0){
						System.out.println(val);
						System.exit(0);
					}
				}
			}
		}.start();
//		类中i的值循环增加
		while(true)
			ae.next();
		
		
	}
}
