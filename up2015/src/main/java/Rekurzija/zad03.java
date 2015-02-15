package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad03 implements rekurzija {
    @Override
    public double f_iter(int n) {
        int i;
        double sum = (n / 2) + 1;
        for (i = n - 1; i >= 0; i--) {
            sum = ((i / 2) + 1) + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        if (i == n) return (n / 2) + 1;
        return ((i / 2) + 1) + 1.0 / f_rek(i + 1, n);
    }
}