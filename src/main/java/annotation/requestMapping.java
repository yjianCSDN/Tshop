package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Author
 * @Date
 */
@Target(ElementType.METHOD)

public @interface requestMapping {
    String value() default "";
    int sun();

}
