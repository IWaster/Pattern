package club.ouka.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 17:47
 */
public class LazySingleton implements Serializable,Cloneable{

    private static volatile LazySingleton lazySingleton;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("禁止多实例");
        }
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class){
            lazySingleton = new LazySingleton();}
        }
        return lazySingleton;
    }

    public Object readResolve(){
        return lazySingleton;
    }

}
