package club.ouka.pattern.singleton.lazy;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 19:35
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (LazyHolder.lazyInnerClassSingleton != null) {
            throw new RuntimeException("禁止多实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazyInnerClassSingleton;
    }

    private static class LazyHolder{
        private static  final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }

    private Object readResolve(){
        return LazyHolder.lazyInnerClassSingleton;
    }
}
