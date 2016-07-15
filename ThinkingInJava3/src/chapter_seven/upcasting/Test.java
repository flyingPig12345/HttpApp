package chapter_seven.upcasting;
/**
 * 此Demo用的是向上转型：
 * 这样的结果是只要添加子类就可以直接在Test中进行调用，
 * 而 不用再写一些其他的代码在我们的应用当中（Test应用的类）
 * 区别与NoneUpcasting的情况
 * @author Administrator
 *	形式是父类做为参数列表，子类传递引用，此引用调用该子类对与父类的重写方法
 *	至于子类传递的引用（已经转型到了父类）是哪个实现类，是有一种叫动态绑定（后期绑定）的java机制实现的
 *	怎样实现，Think in Java 并没有讲的很详细
 *	前期绑定是编译期就决定的，比如static 与final 修饰的，在运行前就被编译成功
 *  而向上转型是在Test运行前无法决定的（为了表示其不可确定行，用随机数确定调用哪个方法）
 *  所以，java添加了一种动态绑定，这种机制与调用方法的机制有关
 */
public class Test {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String args[]){
		Shape [] s = new Shape[9];
		for(int i = 0;i<s.length;i++){
			s[i] = gen.next();
		}
		for(int i = 0 ;i<s.length;i++){
			s[i].draw();
		}
	}


}
