package chapter_eight.innerClass.localInnerClasses;

/**
 * 	在代码块中创建的内部类叫做局部内部类，不能有限制性修饰符
 * 	静态的内部类叫做嵌套类
 * 	将实现缩写到一个类或接口的{}范围内,叫做匿名内部类 
 * （匿名类的的声明是在编译时进行，实例化在运行时进行，这意味着for循环中的一个new语句会创建相同匿名类的几个实例，而不是创建几个不同匿名类的一个实例。）
 */
public class LocalInnerClass {

	private int count = 0;

	Counter geCounter(final String name) {
		// inner class in method
		class LocalCounter implements Counter {
			// constructor
			public LocalCounter() {
				System.out.println("LocalCounter");
			}
			// inner class method
			public int next() {
				System.out.print("c1 "+name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	
	Counter getCounter2(final String name){
//		anonymous class
		return new Counter(){
			{
				System.out.println("Counter()");
			}
			public int next(){
				System.out.print("c2 "+name);
				return count++;
			}
		};
	}
	
	public static void main(String args[]){
		LocalInnerClass lic = new LocalInnerClass();
		Counter 
		c1 = lic.geCounter("Local inner"),
		c2 = lic.getCounter2("Anonymous inner");
		for(int i = 0;i<5;i++){
			System.out.println(c1.next());
		}
		for(int i = 0;i<5;i++){
			System.out.println(c2.next());
		}
	}
}
