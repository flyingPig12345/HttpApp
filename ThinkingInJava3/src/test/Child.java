package test;

import org.junit.Test;

/**
 * 父类的方法
 * 
 * @author keqi
 */
class Father {

	public void doTest(Transition me) {
		me.forOverRideMethod();
	}
}

public class Child extends Father {

	@Test
	public void doChildTest() {
		Transition me = new TransitionImpl();
		doTest(me);
	}

}





class TransitionImpl implements Transition {
	// 匿名类的使用

	public void forOverRideMethod() {
		System.out.println("像不像js中的传递方法");
	}
}

interface Transition {
	public void forOverRideMethod();

}
