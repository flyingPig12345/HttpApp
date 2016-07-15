package chapter_eight.innerClass;

public class Parcel2 {
	//内部类
	class Destination {
		private String label;
		Destination (String whereTo){
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	//本类中的方法    返回一个内部类的引用用来进行对内部类的操作
	public Destination to(String s){
		return new Destination(s);
	}
	
	public void ship(String dest){
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String args[]){
		Parcel2 p = new Parcel2();
		p.ship("Tanzania");
	}
}
