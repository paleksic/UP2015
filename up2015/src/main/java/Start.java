import Rekurzija.zad09;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by paleksic on 2/8/2015.
 * paleksic083@gmail.com
 */
@SuppressWarnings("UnusedAssignment")
public class Start {


    public static void main(String[] args) {
        Start s = new Start();
        zad09 zad = new zad09();
        System.out.println(s.round(zad.f_iter(4, 9), 6));
        System.out.println(s.round(zad.f_iter(4,9),6));


    }
    public double round(double broj, int decimale){
        if(decimale<0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(broj);
        return bd.setScale(decimale, RoundingMode.HALF_UP).doubleValue();
    }
}
