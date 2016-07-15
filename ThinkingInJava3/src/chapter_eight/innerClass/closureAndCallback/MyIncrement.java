package chapter_eight.innerClass.closureAndCallback;

public class MyIncrement {

	void increment(){
		System.out.println("Other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}
