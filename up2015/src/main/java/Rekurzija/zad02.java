package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad02 implements rekurzija {

    @Override
    public double f_iter(int n) {
        return 0;
    }

    public double f_iter(int m, int n) {
        double sum = n;
        for (int i = n - 1; i >= m; i--) {
            sum = i + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int m, int n) {
        if (m == n) return n;
        return m + 1.0 / f_rek(m + 1, n);
    }
}
