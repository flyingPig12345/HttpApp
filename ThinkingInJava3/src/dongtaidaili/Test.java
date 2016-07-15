package dongtaidaili;


public class Test {
	public static void main(String[] args) {
		

		Interceptor interceptor = new Interceptor() { 
		    public Object intercept(Invocation invocation)  throws Throwable {  
		        System.out.println("Go Go Go!!!");  
		        return invocation.proceed();  
		    }

		};  
		
		TargetInterface target = (TargetInterface)ProxyHandler.bind(new ConcreteClass(), interceptor);  
		 target.targetMethodA(3);
		
	}
	
}
