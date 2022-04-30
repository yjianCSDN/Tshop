package annotation;

import org.apache.commons.lang3.reflect.MethodUtils;
import sun.reflect.misc.MethodUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author
 * @Date
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("annotation.UersController");//找这个UserController的类
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //Annotation annotation = declaredMethods[0].getAnnotations()[0];
        boolean result = clazz.isAnnotationPresent(Controller.class);//isAnnotation.UsersController中的是否能够被Controller注解修饰
        Annotation[] annotations = clazz.getAnnotations();
        Method methods[] = MethodUtils.getMethodsWithAnnotation(clazz,requestMapping.class);
        System.out.println(methods.length);
//        for(Method method : methods){
//            requestMapping requestMapping =  method.getAnnotation(requestMapping.class);
//            System.out.println("注解的属性值："+requestMapping.value());
//        }
        Arrays.stream(methods).forEach((method)->{
            System.out.println(method.getAnnotation(requestMapping.class));
        });
        System.out.println(declaredMethods);
      //  System.out.println(annotation);
    }
}
