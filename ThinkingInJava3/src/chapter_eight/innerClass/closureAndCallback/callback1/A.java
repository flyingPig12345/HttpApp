package chapter_eight.innerClass.closureAndCallback.callback1;

/**
 * A调用b的方法进行实现
 * b调用a的属性判断是否执行
 * new TerroristAttack().attack(new A());
 * new B().method(new A());
 * @author Administrator
 *
 */
public class A implements BoomWTC {
	private boolean decide = true;
	private TerroristAttack ta;
	// 获得拉登的决定
	public boolean benLaDengDecide() {
		return decide;
	}
	// 执行轰炸世贸
	public void boom(){  
	    ta.attack(new A());
	  }

	//测试
	public static void main(String args[]){
		new TerroristAttack().attack(new A());
	}
}
