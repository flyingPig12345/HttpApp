package chapter_eight.innerClass.Demo.demo4;

class Z extends D{
	//return a instance of E
	E makeE(){
		return new E(){};
	}
}
