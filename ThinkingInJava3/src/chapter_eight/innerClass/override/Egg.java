package chapter_eight.innerClass.override;

public class Egg {
	

	public void doTest(Yolk y){
		y.doTest();
	}
	
	
	//内部类
	protected  class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk()");
		}
		public  void doTest(){
			System.out.println("没重载内部类方法");
		}
	}
	
}
