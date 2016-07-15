package chapter_thirteen.thread.h_applyDemo;
import java.io.IOException;
/**
 * 在控制器中任意输入并 Enter
 * 图形界面初步涉及
 */
public class ResponsiveUI extends Thread{
	public static volatile double d = 1;
	//constructor
	public ResponsiveUI(){
		setDaemon(true);
		start();
	}
	//Thread run()
	@Override
	public void run(){
		while(true){
			d = d + (Math.PI + Math.E)/d;
		}
	}
	//test
	public static void main(String args[]) throws Exception{
		new ResponsiveUI();
		Thread.sleep(300);
		System.in.read();
		System.out.println(d);
	}
}

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI(){
		while(d>0){
			d = d + (Math.PI + Math.E)/d;
		}
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
