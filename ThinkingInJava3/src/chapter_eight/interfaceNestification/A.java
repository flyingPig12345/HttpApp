package chapter_eight.interfaceNestification;

public class A {
	interface B{
		//这是匿名类使用的形式吧
		void f();
	}
	public class BImpl implements B{
		public void f(){}
	}
	private class BImpl2 implements B{
		public void f(){}
	}
	public interface C{
		void f();
	}
	class CImpl implements C{
		@Override
		public void f() {}
	}
	class CImpl2 implements C{
		@Override
		public void f() {}
	}
	private interface D{
		void f();
	}
	class DImpl implements D{
		@Override
		public void f() {}
	}
	class DImpl2 implements D{
		@Override
		public void f() {}
	}
	public D getD(){
		return new DImpl2();
	}
	private D dRef;
	public void receiveD(D d){
		dRef = d;
		dRef.f();
	}
}
