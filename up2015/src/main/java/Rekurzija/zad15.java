package Rekurzija;

/**
 * Created by paleksic on 2/26/2015.
 * paleksic083@gmail.com
 */
public class zad15 implements rekurzija {
    @Override
    public double f_iter(int n) {
        int i;
        double sum = (n % 2 == 0) ? n : 1;
        for (i = n - 1; i > 0; i++) {
            if (i % 2 == 0) sum = n + 1.0 / sum;
            else sum = 1.0 + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        if (i == n) return (n % 2 == 0) ? n : 1.0;
        if (i % 2 == 0) return n + 1.0 / f_rek(i + 1, n);
        else return 1.0 + 1.0 / f_rek(i + 1, n);
    }
}
