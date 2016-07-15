package test2;

//父类
class Father{
	public void Test(Father_inner arg0){
		//为了让Child类调用正确的method方法，所以只能以的形式传递过来具体实例化的对象了
		arg0.method();
	}
	abstract class Father_inner{
		abstract void method();
	}
}

//子类
public class Child extends Father{
	
	@org.junit.Test
	public void doTest(){
		//就是为了将我写在下面的method 方法传递个给一个类的对象
		Child_inner arg0 = new Child_inner();
		this.Test(arg0);
	}

	class  Child_inner extends Father_inner{

		@Override
		void method() {
			System.out.println("我就是为了写这样的一个方法传递过去，"
					+ "就当是js传递方法的变形版的了");
		}
		
	}
}
