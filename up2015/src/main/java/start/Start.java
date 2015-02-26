package start;

import Rekurzija.zad16;
import funkcije.Round;

/**
 * Created by paleksic on 2/8/2015.
 * paleksic083@gmail.com
 */
@SuppressWarnings("UnusedAssignment")
public class Start {


    public static void main(String[] args) {
        //Start s = new Start();
        zad16 zad = new zad16();
        System.out.println(Round.round(zad.f_iter(6), 6));
        System.out.println(Round.round(zad.f_rek(1, 6), 6));
        //System.out.println((zad.f_rek(4, 21)));
    }
}
