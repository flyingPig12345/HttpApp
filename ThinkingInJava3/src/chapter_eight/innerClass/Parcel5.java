package chapter_eight.innerClass;
/**
 * 在一个方法的任意作用域创建内部类
 * @author Administrator
 *
 */
public class Parcel5{

	//Parcel5 的方法
	private  void internalTracking(boolean b){
		if(b){
			/*
			 * 在这里创建内部类
			 */
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					this.id = s;
				}
				String getSlip(){
					return id;
				}
			}
			//一个对内部类的引用
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.println(s);
		}
	}
	//Pracel5  类中的方法
	public void track(){
		internalTracking(true);
	}
	//测试
	public static void main(String[] args){
		Parcel5 p = new Parcel5();
		p.track();
		
		
	}
}
