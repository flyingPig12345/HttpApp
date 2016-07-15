package chapter_eight.innerClass.parcel4;

import chapter_eight.innerClass.parcel3.Destination;

/**
 * 将内部类写在方法里，但的个人认为，仅仅是写在方法中了，与之前的并无太大区别
 * @author Administrator
 *
 */
public class Parcel4 {

	//Parcel  类的方法
	public Destination dest(String s){
		
		//方法中的实现类
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				this.label = whereTo;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
	
	
	public static void main(String[] args){
		Parcel4 p = new Parcel4();
		Destination d = p.dest("Tanzania");
		System.out.println(d.readLabel());
	}
	
	
	
}
