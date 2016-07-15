package chapter_eight.interfaceNestification;

/**
 * 没什么现象，只是为了说明能这么干貌似
 * @author Administrator
 *
 */
public class NestingInterfaces {

	public class BImpl implements A.B{
		public void f(){}
	}
	class CImpl implements A.C{
		public void f(){}
	}
	class EImpl implements E{
		public void g(){}
	}
	class EGImpl implements E.G{
		public void f(){}
	}
	class EImpl2 implements E{
		public void g(){}
		class EG implements E.G{
			public void f(){}
		}
	}
	public static void main(String[] args){
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
