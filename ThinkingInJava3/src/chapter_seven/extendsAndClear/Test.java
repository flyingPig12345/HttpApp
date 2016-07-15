package chapter_seven.extendsAndClear;

/**
 * 本Demo继续验证了前面的初始化顺序
 * 1.先静态变量后实例变量
 * 2.调用构造方法 ，如果有父类则找到父类（递归），从父类开是初始化
 * 3.初始化时，先要初始化当前构造方法的实力变量
 * @author Administrator
 *	关闭的顺序是：后用先关
 *	比如进入双层门的时候，先打开1门，再打开2门进入，如果要出来
 *	则关闭的顺序是先关闭2门，再关闭1门，若先关闭1门则2门在1门内，无法碰触并使之关闭
 *	注手动关闭的时候需要最后调用父类的关闭方法保证全部关闭成功，否则容易出现失败
 */
public class Test extends Amphibian{
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");

	public Test(){
		System.out.println("Test()");
	}
	protected void dospose(){
		System.out.println("Test disponse");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String args[]){
		Test t = new Test();
		System.out.println("Bye");
		t.dispose();
		
	}
}
