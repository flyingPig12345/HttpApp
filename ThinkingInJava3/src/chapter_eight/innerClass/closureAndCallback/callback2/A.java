package chapter_eight.innerClass.closureAndCallback.callback2;

public class A implements CallBack {
	private B b;

	public void doCRUD() {
		System.out.println("执行add操作...");
	}

	public void add() {
		b.execute(new A());// 【you call me】
	}
	
	
	public static void main(String args[]){
		new B().execute(new A());
	}
}
