package funkcije;

import java.math.BigDecimal;

/**
 * Created by paleksic on 2/20/2015.
 * paleksic083@gmail.com
 */
public class Round {
    public static double round(double broj, int cifre) {
        if (cifre < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(broj);
        return bd.setScale(cifre, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
