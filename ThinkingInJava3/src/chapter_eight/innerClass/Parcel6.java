package chapter_eight.innerClass;
import chapter_eight.innerClass.parcel3.Contents;
public class Parcel6 {
	
	//返回一个接口的引用
	public Contents cont(){
		//返回一个接口的实现
		return new Contents(){
			//定义实现内容，并将创建的实现向上转型为接口类型
			private int i = 11;
			public int value(){
				return i;
			}
		};
	}
	public static void main(String args[]){
		Parcel6 p = new Parcel6();
		Contents c = p.cont();
		System.out.println(c.value());
	}

	//实际上cont的方法是将内部类生成的方法的内部
	public Contents contDemo(){
		class MyContents implements Contents{
			private int i =11;
			public int value(){
				return i;
			}
		}
		return new MyContents();
	}
	
	
}
