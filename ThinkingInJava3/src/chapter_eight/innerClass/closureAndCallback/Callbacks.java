package chapter_eight.innerClass.closureAndCallback;

/**
 * 闭包：指的是一个可调用的对象，它记录了(一些来自于创建它的作用域的)一些信息(内部类)
 * 回调：是说对象能够携带一些信息，是他在稍后某个时间调用初始的对象
 * @author Administrator
 *
 */
public class Callbacks {
	public static void main(String args[]){
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);     //输出： Other operation
		Caller caller1 = new Caller(c1);
		//获取内部类的引用
		Incrementable c3 = c2.getCallbackReference();
		Caller caller2 = new Caller(c3);
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
