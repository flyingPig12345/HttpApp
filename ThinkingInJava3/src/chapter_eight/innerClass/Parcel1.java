package chapter_eight.innerClass;
/**
 * 存在于类中的类叫做内部类
 * 展示内部类的样子
 * @author Administrator
 *
 */
public class Parcel1 {
	
	//内部类
	private  class Destination {
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){
			return label;
		};
	}
	//本类中方法
	public Destination ship(String dest){
		return this.new Destination(dest);
	}
	
	public static void main(String args[]){
		Parcel1 p = new Parcel1();
		
		Destination innerClass= p.ship("Tanzania");
		System.out.println(innerClass.readLabel());
	}
}
