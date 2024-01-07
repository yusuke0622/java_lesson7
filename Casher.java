public class Casher {
    
    //static付きいわゆるクラスメソッドとして定義されており、インスタンス生成なしで呼び出せる（クラス名.メソッド名）
    //インターフェースを定義すると、型として扱うことができる（Coupon型)
    public static int payment(int amount, Coupon coupon) {
        int ret = coupon.discount(amount);
        return ret;
    }
}