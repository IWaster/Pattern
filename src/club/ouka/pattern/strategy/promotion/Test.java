package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:57
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new GroupByStrategy());
        activity618.execute();
    }
}
