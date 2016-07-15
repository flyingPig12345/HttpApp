package test3;

import org.junit.Test;
interface Transition {
	public void forOverRideMethod();
}
/**
 * 父类的方法
 */
class Father {

	public void doTest(Transition me) {
		me.forOverRideMethod();
	}
}

public class Child extends Father {
	@Test
	public void doChildTest() {
		Transition me = doGetReference();
		this.doTest(me);
	}
	//返回一个引用
	public Transition doGetReference(){
		return new Transition() {
			@Override
			public void forOverRideMethod() {
				System.out.println("像不像js中的传递方法");
			}
		};
	}
}

