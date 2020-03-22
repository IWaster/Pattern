package club.ouka.pattern.strategy.promotion;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 12:54
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy=promotionStrategy;
    }

    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
