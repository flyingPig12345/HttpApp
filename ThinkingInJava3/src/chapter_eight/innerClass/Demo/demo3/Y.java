package chapter_eight.innerClass.Demo.demo3;

public class Y implements A{
	B makeB(){
		return new B(){};
	}
}
