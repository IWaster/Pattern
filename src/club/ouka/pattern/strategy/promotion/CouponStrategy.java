package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:19
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，抵扣100");
    }
}
