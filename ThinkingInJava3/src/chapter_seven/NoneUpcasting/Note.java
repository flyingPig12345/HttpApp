package chapter_seven.NoneUpcasting;

public class Note extends Instrument{
	private String noteName;
	private Note(String noteName){
		this.noteName = noteName;
	}
	public String toString(){
		return this.noteName;
	}
	public static final Note
	MIDDLE_C = new Note("Middle c"),
	C_SHARP = new Note("C Sharp"),
	B_FLAT = new Note("B Flat");
	
}
