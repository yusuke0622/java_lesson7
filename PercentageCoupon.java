public class PercentageCoupon implements Coupon {
    //割引クーポン
    double rate;
    
    public PercentageCoupon(double rate) {
        this.rate = rate;
    }
    
    public int discount(int amount) {
        return (int)(amount * rate);
    }
    
}