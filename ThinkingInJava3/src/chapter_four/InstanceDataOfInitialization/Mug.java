package chapter_four.InstanceDataOfInitialization;
/**
 * 该类用于测试实力变量的初始化顺序
 * @author Administrator
 *
 */
public class Mug {
	Mug(int marker){
		System.out.println("Mug("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}

}
