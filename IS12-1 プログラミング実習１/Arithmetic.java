public class Arithmetic {
    /* doublelΜβΞl */
    public double absolute(double value) {
        if(value < 0){                      // ³Μ»θ
            value *= -1.0;                  // Μ½]
        }
        return value;                      // βΞl(doublel)ΜΤp
    }

    /* intlΜβΞl */
    public int absolute(int value) {
        return (int)absolute((double)value);// βΞl(intl)ΜΤp
    }

    /* lΜάό */
    public int round(double value) {
        int sign = 1;                       // 
        if(value < 0) {                     // ³Μ»θ
            sign = -1;                      // Μέθ
        }
        value += (0.5 * sign);              // πlΆ΅lΜάό·ι
        return value;                 // intlΕΤp
    }
}
