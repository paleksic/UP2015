package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad05 implements rekurzija {

    public int isDelilac(int broj, int delilac) {
        if (broj % delilac == 0) return 1;
        return 0;
    }

    @Override
    public double f_iter(int n) {
        int i;
        double sum = 0.0;
        for (i = n; i > 0; i--) if (isDelilac(n, i) == 1) sum = Math.sqrt(i + sum);
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        if (i == n) return Math.sqrt(n);
        if (isDelilac(n, i) == 1) return Math.sqrt(i + f_rek(i + 1, n));
        else return f_rek(i + 1, n);
    }

}
