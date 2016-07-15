package dongtaidaili;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(value = { ElementType.TYPE, ElementType.METHOD })
public @interface MethodName {  
	public String name() default "";
    public String value()  default "";  
} 