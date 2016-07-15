package chapter_seven.polymorphicInConstructors;

public abstract class Glyph {
	abstract void draw();
	Glyph(){
		System.out.println("Glyph() before draw()");
		this.draw();
		System.out.println("Glyph() after draw()");
	}
}
