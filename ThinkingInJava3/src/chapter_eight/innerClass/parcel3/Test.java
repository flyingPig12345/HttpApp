package chapter_eight.innerClass.parcel3;

public class Test {

	public static void main(String args[]){
		Parcel3 p = new Parcel3();
//		Contents c = p.cont();
		Destination d = p.dest("Tanzania");
		System.out.println(d.readLabel());
	}
}
