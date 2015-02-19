package start;

import Rekurzija.zad12;

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
        zad12 zad = new zad12();
        System.out.println((zad.f_iter(5,7,6)));
        //System.out.println((zad.f_rek(4, 21)));
    }
    public double round(double broj, int decimale){
        if(decimale<0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(broj);
        return bd.setScale(decimale, RoundingMode.HALF_UP).doubleValue();
    }
}
