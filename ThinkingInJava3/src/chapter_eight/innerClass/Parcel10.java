package chapter_eight.innerClass;

import chapter_eight.innerClass.parcel3.Contents;
import chapter_eight.innerClass.parcel3.Destination;

/**
 * 1.当内部类对象与其外围类的对象之间的联系不需要时，
 * 将内部类声明为static，这时的内部类叫做嵌套类（nested class）
 * @author Administrator
 *  特性：
 *  1.要创建的嵌套类的对象，并不需要其外围类的对象
 *  2.不能从嵌套类的对象中访问非静态的外围类对象
 *  嵌套类同时拥有静态方法与内部类的特性
 *  
 */
public class Parcel10 {
	/**
	 * 创建一个嵌套类  ParcelContents
	 */
	private static class ParcelContents implements Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	/**
	 * 创建第二个嵌套类
	 */
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo){
			this.label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
		//内部类静态方法
		public void f(){
			System.out.println("调用了静态类类的实例方法");
		}
		static int x = 10;
		//2.1  嵌套类
		static class AnotherLevel{
			public static void f(){}
			static int x = 10;
		}
	}
	/**
	 * 获取第一个嵌套类的引用    描述的引用
	 */
	public static Destination dest(String s){
		return new ParcelDestination(s);
	}
	/**
	 * 获取第二个嵌套类的引用
	 */
	public static Contents cont(){
		return new ParcelContents();
	}
	
	/**
	 * 测试
	 */
	public static void main(String args[]){
	}
	

}
