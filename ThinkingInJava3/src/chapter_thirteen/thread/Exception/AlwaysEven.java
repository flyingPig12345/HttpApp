package chapter_thirteen.thread.Exception;

public class AlwaysEven {

	private int i;
	public void next(){
		i++;
		i++;
	}
	public int getValue(){
		return i;
	}
	// main()
	public static void main(String args[]){
		final AlwaysEven ae = new AlwaysEven();
		
		//inner class in main()
		new Thread("Watcher"){
			// run
			public void run (){
				while(true){
					int val = ae.getValue();
					if(val% 2 != 0){
						System.out.println(val);
						System.out.println(0);
					}
				}
			}
		}.start();
		while(true){
			ae.next();
		}
		
	}
}
