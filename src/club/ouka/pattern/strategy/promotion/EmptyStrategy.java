package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:17
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有促销活动");
    }
}
