package club.ouka.pattern.proxy.cglibproxy;


import club.ouka.pattern.proxy.Person;
import club.ouka.pattern.proxy.jdkproxy.Girl;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 10:55
 */
public class Test {
    public static void main(String[] args) {
        Person obj = (Person) new Matchmaker().getInstance(Girl.class);
        obj.findLove();
    }
}
