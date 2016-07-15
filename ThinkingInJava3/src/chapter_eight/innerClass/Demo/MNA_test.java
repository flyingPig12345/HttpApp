package chapter_eight.innerClass.Demo;
/**
 * 内部类会自动拥有他外围类的索引
 * 而这个索引是隐藏的
 * @author Administrator
 *
 */ 
public class MNA_test {

	public static void main(String args[]){
		MNA mna = new MNA();
		MNA.A mana = mna.new A();
		MNA.A.B mnaab = mana.new B();
		mnaab.h();
	}
}
