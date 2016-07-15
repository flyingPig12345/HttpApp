package chapter_eight.innerClass;
/**
 * 引用外围类的对象
 * @author Administrator
 *  外围类创建内部累的对象 必须用下面的方式
 *  Parcel11.Contents c = p.new Contents();
 *  除非是嵌套类的内部类（static）
 *  或者是在外围类中创建返回一个内部类的对象的引用
 */
public class Parcel11 {

	//内部类   内容
	class Contents {
		private int i = 11;
		public int value(){return i;}
	}
	//内部类  目的
	class Destiantion{
		private String label;
		Destiantion(String whereTo)		{
			this.label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	//测试
	public static void main(String args[]){
		Contents p = new Parcel11().new Contents() ;
//		Parcel11.Contents c = p.new Contents();
//		Parcel11.Destiantion d = p.new Destiantion("Tanzania");
//		System.out.println(d.readLabel());
	}
}
