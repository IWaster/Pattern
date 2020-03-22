package club.ouka.pattern.singleton.hungry;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 17:40
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
