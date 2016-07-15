package chapter_eight.innerClass.override;
/**
 * 内部类的继承是需要明确写定的，写定的方法就是继承于  外围类.内部类
 * @author Administrator
 *	否则的话外围类的父类和子类的两个内部类没有任何关系
 */
public class BigEgg2 extends Egg2{

	public BigEgg2(){
		
		//构造器中创建待重载的基类对象
		System.out.println("\t1 构造方法对象");
		insertYolk(new Yolk());
	}
	
	public static void main(String args[]){
		Egg2 e2 = new BigEgg2();
		e2.g();
	}
	
	
	
	
	
	//内部类
	public class Yolk extends Egg2.Yolk{
		public Yolk(){
			System.out.println("\t2 内部类构造方法");
		}
		public void f(){
			System.out.println("\t3 内部类重写方法");
		}
	}
}
