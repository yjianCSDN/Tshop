package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author
 * @Date
 * retention是元注解
 */
@Retention(RetentionPolicy.RUNTIME)//如果是runtime的话，运行之后才会启动；class在刚开始之前才就会启动。
@Target(ElementType.TYPE)

public @interface Controller {
    String value();
    int No()default 123;

}
