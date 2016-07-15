package chapter_eight.innerClass.override;

public class Egg2 {

	private Yolk y = new Yolk();
	//constructor 构造器
	public Egg2(){
		System.out.println(" 1 环绕类 构造方法");
	}
	//插入 
	public void insertYolk(Yolk yy){
		y = yy;
	}
	//调用内部类的方法
	public void g(){
		y.f();
		
	}
	
	//内部类
	protected class Yolk{
		public Yolk(){
			System.out.println(" 2 内部类 构造方法");
		}
		public void f(){
			System.out.println(" 3 内部类方法");
		}
	}
}
