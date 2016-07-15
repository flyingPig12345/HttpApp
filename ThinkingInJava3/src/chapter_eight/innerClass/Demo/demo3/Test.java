package chapter_eight.innerClass.Demo.demo3;
/**
 * 没看到任何意义
 * @author Administrator
 *
 */
public class Test {
	static void takesA(A a){}
	static void takesB(B b){}
	public static void main(String[] args){
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}

}
