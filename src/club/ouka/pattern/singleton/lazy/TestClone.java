package club.ouka.pattern.singleton.lazy;

import club.ouka.pattern.factory.abstractfactory.INote;
import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 23:29
 */
public class TestClone {
    public static void main(String[] args) throws Exception {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton s1 = (LazySingleton) instance.clone();
        System.out.println(s1);
        System.out.println(instance);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
//        Collections.checkedList(objects,1);
    }
}
