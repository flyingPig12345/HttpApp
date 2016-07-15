package chapter_eight.innerClass.Demo;

/**
 * 证明了一件事   ： 正常情况下，接口内不能防止任何代码
 * 但嵌套类可以作为接口的一部分，因为他是static 的
 * @author Administrator
 *
 */
public interface Demo1 {

	static class Inner{
		int i ,j,k;
		public Inner(){}
		void f(){}
	}
}
