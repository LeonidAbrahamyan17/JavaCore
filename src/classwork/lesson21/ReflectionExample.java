package classwork.lesson21;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
//        AnnotationExample example = new AnnotationExample();
//        Class<?> aClass = example.getClass();
        Method[] declaredMethods = AnnotationExample.class.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof MyAnno) {
                    MyAnno myAnno = (MyAnno) declaredAnnotation;
                    System.out.println(myAnno.str());
                }

            }
        }
    }
}