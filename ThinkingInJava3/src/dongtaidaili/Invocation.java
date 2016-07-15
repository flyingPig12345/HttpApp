package dongtaidaili;

import java.lang.reflect.InvocationTargetException;

public interface Invocation {

	public Object proceed() throws InvocationTargetException, IllegalAccessException ;
}
