package chapter_eight.innerClass.Demo;

public class MNA {

	private void f(){}
	//内部类
	class A{
		private void g(){}
		//内部类1.1
		public class B{
			void h(){
				g();
				f();
			}
		}
	}
}
