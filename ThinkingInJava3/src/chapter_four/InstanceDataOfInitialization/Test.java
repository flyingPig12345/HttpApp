package chapter_four.InstanceDataOfInitialization;

/**
 * 该测试说明了实例变量与静态变量初始化顺序的不同
 * 静态变量的初始化是在当类被首次用到（加载）的时候，并且只初始化一次
 * 而实例变量的初始化则是在调用构造器的时候，否则不初始化，
 * 比如本测试
 * 先进行的是主方法（主方法是静态方法）在调用构造方法的时候才会进行实例变量的初始化
 * @author Administrator
 *
 */
public class Test {
static{
		
		c1 = new Mug(1);
		System.out.println("c1 & c2 initialized");
	}
	static Mug c1 ;
	Mug c2 = new Mug(2);
	
	Test(){
		System.out.println("构造器Test()");
	}
	
	
	public static void main(String args[]){
		System.out.println("Inside main()");
		Test t = new Test();
		
	}
}
