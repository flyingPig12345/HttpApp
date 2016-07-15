package chapter_seven.extendsAndClear;

public class Animal extends LivingCreature{

	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");

	Animal(){
		System.out.println("Animal()");
	}
	protected void dispose(){
		System.out.println("Animal dispose");
		p.dispose();
		t.dispose();
		super.dispose();
	}
}
