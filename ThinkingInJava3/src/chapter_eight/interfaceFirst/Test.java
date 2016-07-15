package chapter_eight.interfaceFirst;
/**
 * 接口的向上转型
 * 接口的核心作用是向上转型（为了能向上转型为不只一个基类型）
 * 实现另类版本的（c++的多继承能力）多继承的变种类
 * @author Administrator
 * 使用接口的第二个原因是防止客户端程序员创建对象（为什么要防止呢）
 *
 */
public class Test {

	public static void main(String[] args){
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwim x){
		x.swim();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	
}
