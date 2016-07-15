package chapter_thirteen.thread.j;

public class InvariantFailure implements InvariantState{
	
	public Object value;
	public InvariantFailure(Object value){
		this.value = value;
	}
}
