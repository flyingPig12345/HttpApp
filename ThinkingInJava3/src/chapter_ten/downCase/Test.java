package chapter_ten.downCase;
/**
 * 向下强转
 * 由于放入的是Object数组中所以所有的对象都会被当作Object 类型看待
 * 所以，调用draw方法的时候，需要向下强转
 * @author Administrator
 *
 */
public class Test {
	public static void main(String args[])
	{
		Object[] shapeList = {
				new Circle(),
				new Square(),
				new Triangle()
		};
		//遍历
		for(int i = 0;i< shapeList.length;i++){
			((Shape) shapeList[i]).draw();
		}
	}
}
