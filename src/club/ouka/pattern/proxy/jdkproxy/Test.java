package club.ouka.pattern.proxy.jdkproxy;

import club.ouka.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 6:10
 */
public class Test {
    public static void main(String[] args) {
        Person obj = (Person) new Matchmaker().getInstance(new Girl());
        obj.findLove();

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{Person.class});
            FileOutputStream ps = new FileOutputStream("E://$proxy0.class");
            ps.write(bytes);
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
