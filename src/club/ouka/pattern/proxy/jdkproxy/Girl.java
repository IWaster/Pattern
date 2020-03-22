package club.ouka.pattern.proxy.jdkproxy;

import club.ouka.pattern.proxy.Person;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 5:57
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("男生");
    }
}
