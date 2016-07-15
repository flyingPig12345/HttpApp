package chapter_eight.innerClass.closureAndCallback;

public class Caller {

	private Incrementable callbackReference;
	Caller(Incrementable cbh){
		callbackReference = cbh;
	}
	void go(){
		callbackReference.increment();
	}
}
