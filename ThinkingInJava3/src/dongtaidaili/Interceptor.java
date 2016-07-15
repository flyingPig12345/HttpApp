package dongtaidaili;


public interface Interceptor { 
	
	public Object intercept(Invocation invocationImpl) throws Throwable;

} 