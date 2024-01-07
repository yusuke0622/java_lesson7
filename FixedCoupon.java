public class FixedCoupon implements Coupon {
    //定額クーポン
    int discountAmount;
    
    public FixedCoupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    public int discount(int amount) {
        return amount - discountAmount;
    }
}