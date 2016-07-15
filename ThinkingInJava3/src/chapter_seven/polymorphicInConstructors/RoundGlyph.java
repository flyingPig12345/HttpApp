package chapter_seven.polymorphicInConstructors;

public class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r){
		this.radius = r;
		System.out.println("RoundGlyph.RoundGlyph(),rdius = "+radius);
	}
	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " +radius);
	}

}
