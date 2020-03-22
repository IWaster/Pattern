package club.ouka.pattern.singleton.lazy;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 19:25
 */
public class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
        Constructor constructor = LazySingleton.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        System.out.println(o);
        System.out.println(instance == o);


//        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//        System.out.println(instance);
//        Constructor<LazyInnerClassSingleton> declaredConstructor = LazyInnerClassSingleton.class.getDeclaredConstructor(null);
//        declaredConstructor.setAccessible(true);
//        LazyInnerClassSingleton lazyInnerClassSingleton = declaredConstructor.newInstance();
//        System.out.println(lazyInnerClassSingleton == instance);
    }
}
