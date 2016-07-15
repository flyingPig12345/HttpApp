package chapter_eight.innerClass.Demo.demo4;
/**
 * 也没看到任何意义  p301
 * @author Administrator
 *
 */
public class Test {

	static void takesD(D d){}
	static void takesE(E e){}
	public static void main(String args[]){
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}
