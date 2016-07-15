package chapter_ten.load;
/**
 * 仅仅显示了一个新的加载class方式 class.forName();
 * @author Administrator
 *
 */
public class SweetShop {
	public static void main(String args[]){
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try{
			Class.forName("chapter_ten.load.Gum");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After Class.forName('Gum')");
		new Cookie();
		System.out.println("After creating Cookie");
		
	
	
	}
}
