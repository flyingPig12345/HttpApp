package chapter_four.staticDataOfInitialization;

public class Table {
	static Bowl b1 = new Bowl(1);

	public Table() {
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int marker){
		System.out.println("f2("+marker+")");
	}
	static Bowl b2 = new Bowl(2);

}
