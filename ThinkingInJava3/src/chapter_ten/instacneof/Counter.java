package chapter_ten.instacneof;

/**
 * 记录每种宠物的数量 因为重写了toString
 * 方法，所以次类输出的时候仅仅当作一个技术器使用，而不是输出chapter_ten.instacneof.Counter@6a688d6f
 */
public class Counter {
	int i = 0;

	// counter
	public String toString() {
		return Integer.toString(i);
	}

	public static void main(String args[]) {
		System.out.println(new Counter());
	}
}
