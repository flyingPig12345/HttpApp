package chapter_four.staticDataOfInitialization;

/**
 * P167  
 * 此Demo 说明了初始化的顺序以及   在初始化时，静态变量之进行一次初始化
 * @author Administrator
 *
 */
public class Test {
	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
	public static void main(String[] args ){
		System.out.println("Creating new CupBoard");
		new Cupboard();
		System.out.println("Creating new Cupboard");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}
	
}
