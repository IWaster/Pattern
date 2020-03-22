package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:21
 */
public class GroupByStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("5人拼团享受最低价");
    }
}
