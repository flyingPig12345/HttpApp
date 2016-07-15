package chapter_thirteen.thread.j;
/**
 * 事件产生者
 * @author Administrator
 *	原理是   创建本类 对象传递到线程类中，使线程类监测本类，如果本类产生了  单数的i ，则线程停止
 *
 */
public class EvenGenerator_Test implements Invariant{

	private int i;
	public void next(){i++;i++;};
	public int getValue(){ return i;};
	
	@Override
	public InvariantState invariant() {
		int val = i;
		if(val % 2 ==0){
			return new InvariantOK();
		}else{
			return new InvariantFailure(new Integer(val));
		}
	}
	
	public static void main(String args[]){
		EvenGenerator_Test gen = new EvenGenerator_Test();
		new InvariantWatcher(gen);
		while(true){
			gen.next();
		}
	}

}
