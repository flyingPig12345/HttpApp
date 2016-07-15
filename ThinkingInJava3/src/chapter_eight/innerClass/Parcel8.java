package chapter_eight.innerClass;

import chapter_eight.innerClass.parcel3.Destination;
/**
 * 对于内部类来说，他仍然是一个类 尽管他没有名字，并且属性参数可以从外面传入
 * 但是对于一个类来说，是应该先实例该对象，然后才能将值传入，所以在一个方法中的内部类来说，
 * 如果传入的参数dest不是final修饰的，则不是一个可以直接用于初始化的常量，声明则不会成功
 * 尽管dest在运行期间已经可以知道，但编译过不去
 * @author Administrator
 *	总的来说，先实例类，再进行赋值
 */
public class Parcel8 {

	public Destination dest(final String dest){
		return new Destination(){
			private  String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel8 p = new Parcel8();
		Destination d = p.dest("Tanzania");
		System.out.println(d.readLabel());
	}
}
