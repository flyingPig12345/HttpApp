package chapter_seven.NoneUpcasting;

/**
 * 没用用到向上转型例子，相当于分别创建三个类
 * 分别调用他们的方法
 * @author Administrator
 *
 */
public class Music2 {

	public static void tune(Wind i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Stringed i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i){
		i.play(Note.MIDDLE_C);
	}
	public static void main(String args[]){
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
	
}
