package chapter_seven.polymorphicInConstructors;
/**
 * 初始化的时候，会先进行父类的初始化，当父类构造器没初始化完毕的时候，调用的其他方法可能并没有被初始化，
 * 而这时候内容为初始值	比如int 初始值为0 ，当在构造器内调用子类的实现时，会产生该问题
 * @author Administrator
 * 结论： 构造器尽量避免调用方法，除非是final 或者static类型
 * 静态方法中不能调用实例变量，所以猜测即使是在其他行为前会将实例变量初始化，但也是在静态属性初始化之后
 * 另外final起作用是在分配空间时，如果将RoundGlyph 类的 属性声明为final时，则直接被分配空间为赋予的值
 * 由此引起的疑问:堆栈与分配空间是怎么回事？？？？
 */
public class Test {
	public static void main(String args[]){
		new RoundGlyph(5);
	}
}
