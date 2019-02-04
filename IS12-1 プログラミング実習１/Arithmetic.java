public class Arithmetic {
    /* double値の絶対値 */
    public double absolute(double value) {
        if(value < 0){                      // 正負の判定
            value *= -1.0;                  // 符号の反転
        }
        return value;                      // 絶対値(double値)の返却
    }

    /* int値の絶対値 */
    public int absolute(int value) {
        return (int)absolute((double)value);// 絶対値(int値)の返却
    }

    /* 四捨五入 */
    public int round(double value) {
        int sign = 1;                       // 符号
        if(value < 0) {                     // 正負の判定
            sign = -1;                      // 負の設定
        }
        value += (0.5 * sign);              // 符合を考慮し四捨五入する
        return value;                 // int値で返却
    }
}
