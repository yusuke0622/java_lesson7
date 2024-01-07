public class Main {
    public static void main(String[] args) {
        PercentageCoupon coupon1 = new PercentageCoupon(0.3);
        FixedCoupon coupon2 = new FixedCoupon(1000);
        System.out.println(Casher.payment(5000, coupon1));
        System.out.println(Casher.payment(5000, coupon2));
        PercentageCoupon coupon3 = new PercentageCoupon(0.5);
        FixedCoupon coupon4 = new FixedCoupon(1500);
        System.out.println(Casher.payment(5000, coupon3));
        System.out.println(Casher.payment(5000, coupon4));
    }
}