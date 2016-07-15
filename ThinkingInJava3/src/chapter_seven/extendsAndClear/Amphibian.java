package chapter_seven.extendsAndClear;

public class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");

	Amphibian(){
		System.out.println("Amphtbian()");
	}
	protected void dispose(){
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

}
