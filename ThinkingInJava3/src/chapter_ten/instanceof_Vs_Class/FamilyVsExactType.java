package chapter_ten.instanceof_Vs_Class;
/**
 * instaceof   的比较包含继承关系
 * == || equals 不包含继承关系
 * @author Administrator
 *
 */
public class FamilyVsExactType {
	static void test(Object x){
		System.out.println("Testing x of type"+"~~~~"+x.getClass());
		System.out.println("x instanceof Base"+"~~~~"+ (x instanceof Base));
		System.out.println("x instanceof Derived"+"~~~~"+(x instanceof Derived));
		System.out.println("Base.isInstance(x)"+"~~~~"+ (Base.class.isInstance(x)));
		System.out.println("Derived.isInstance(x)"+"~~~~"+ (Derived.class.isInstance(x)));
		System.out.println("x.getClass()==Base.class"+"~~~~"+ (x.getClass()==Base.class));
		System.out.println("x.getClass()==Derived.class"+"~~~~"+ (x.getClass()==Derived.class));
		System.out.println("x.getClass().equals(Base.class)"+"~~~~"+ (x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals(Derived.class)"+"~~~~"+ (x.getClass().equals(Derived.class)));
	}
	
	public static void main(String args[]){
//		test(new Base());
		test(new Derived());
	}
}
