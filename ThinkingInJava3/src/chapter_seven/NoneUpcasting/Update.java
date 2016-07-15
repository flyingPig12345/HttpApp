package chapter_seven.NoneUpcasting;

public class Update {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String args[]){
		Instrument tune = new Instrument();
		tune(new Wind());
		tune(new Stringed());
		tune(new Brass());
	}
}
