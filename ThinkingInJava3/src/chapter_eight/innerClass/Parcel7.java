package chapter_eight.innerClass;

import chapter_eight.innerClass.parcel4.Wrapping;
/**
 * 匿名类继承于父类，有参数的构造器直接调用父类的就可以
 * @author Administrator
 *
 */
public class Parcel7 {

	public Wrapping wrap(int x){
		return new Wrapping(x){
			public int value(){
				return super.value()*47;
			}
		};
	}
	
	public static void main(String args[]){
		Parcel7 p = new Parcel7();
		Wrapping w = p.wrap(10);
		System.out.println(w.value());
	}
}
