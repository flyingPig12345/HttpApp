package chapter_eight.innerClass.closureAndCallback;

public class Callee2 extends MyIncrement{

	private int i = 0;
	private void incr(){
		i++;
		System.out.println(1);
	}
	
	//返回一个内部类的引用
			Incrementable getCallbackReference(){
				return new Closure();
			}
	//内部类
	private class Closure implements Incrementable{
		public void increment(){
			incr();
		}
	}
}
