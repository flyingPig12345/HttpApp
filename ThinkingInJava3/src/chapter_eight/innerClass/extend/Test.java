package chapter_eight.innerClass.extend;
/**
 * 继承一个内部类，子类需要先实现父类的实力
 * 所以子类需要一个父类外部类的依赖索引来辅助调用父类的构造器
 * @author Administrator
 *
 */
public class Test extends WithInner.Inner{
	Test(WithInner wi){
		
		wi.super();
	}
	//测试
	public static void main(String args[]){
		WithInner wi = new WithInner();
		Test ii = new Test(wi);
		
	}
}
