package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:20
 */
public class CashBackStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现200");
    }
}
