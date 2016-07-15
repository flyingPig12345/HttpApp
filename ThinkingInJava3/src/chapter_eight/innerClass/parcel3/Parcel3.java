package chapter_eight.innerClass.parcel3;

/**
 * 这里的内部类所占的位置应该是属性的位置
 * @author Administrator
 *
 */
public class Parcel3 {
	//内部类 实现 内容
	private class PContents implements Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	//第二个内部类实现目的
	protected class PDestination implements Destination{
		private String label;
		private PDestination (String whereTo){
			this.label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	//返回一个对内部类目的的引用
	public Destination dest(String s){
		return new PDestination(s);
	}
	//返回一个对内容内容内部类的引用
	public Contents cont()
	{
		return new PContents();
	}
}
