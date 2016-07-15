package chapter_eight.innerClass.override;
/**
 * 子类与父类拥有完全相同的内部类，不会出现内部类重写的状况
 * @author Administrator
 *
 */
public class BigEgg extends Egg{

	//内部类
	public class Yolk{
		public Yolk(){
			System.out.println("BigEgg.Yolk()");
		}
	}
	
	//main method
	public static void main(String args[]){
		new BigEgg();
		
	}
}
