package chapter_thirteen.thread.j;


public class EvenGeneratorSynchronized implements Invariant{

	private int i;
	public synchronized void next(){
		i++;
		i++;
	}
	public synchronized int getValue(){
		return i;
	}
	
	public InvariantState invariant(){
		int val = this.getValue();
		if(val % 2 == 0){
			return new InvariantOK();
		}
		else{
			return new InvariantFailure(new Integer(val));
		}
	}
	
	public static void main(String args[]){
		EvenGeneratorSynchronized gen =new  EvenGeneratorSynchronized();
		new InvariantWatcher(gen,4000);
		while(true){
			gen.next();
		}
	}
	
	
}
