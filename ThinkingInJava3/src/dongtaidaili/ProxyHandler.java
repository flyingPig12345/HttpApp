package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
	private static Object concreteClass;

	private static Interceptor interceptor;

	private ProxyHandler(Object target, Interceptor interceptor) {
		setConcreteClass(target);
		ProxyHandler.interceptor = interceptor;
	}

	// 通过代理对象包装源对象
	public static TargetInterface bind(Object obj, Interceptor interceptor) {
		return (TargetInterface) Proxy.newProxyInstance(obj.getClass()
				.getClassLoader(), obj.getClass().getInterfaces(),
				new ProxyHandler(obj, interceptor));
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return interceptor.intercept(new InvocationImpl(concreteClass, method, args));
	}

	public static Object getConcreteClass() {
		return concreteClass;
	}

	public static void setConcreteClass(Object concreteClass) {
		ProxyHandler.concreteClass = concreteClass;
	}
}
