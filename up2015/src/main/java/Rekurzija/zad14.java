package Rekurzija;

/**
 * Created by paleksic on 2/20/2015.
 * paleksic083@gmail.com
 * 1 2 4 7 11 16
 * 0 1 2 3 4  5
 */
public class zad14 implements rekurzija {
    @Override
    public double f_iter(int n) {
        int i, j = 1, k = 0;
        double sum;
        for (i = 1; i <= n; i++) {
            j += k++;
        }
        sum = j;
        k = n - 1;
        for (i = n - 1; i > 0; i--) {
            j -= k--;
            sum = j + 1.0 / sum;
        }

        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        return f_rek2(i, n, 1, 1);
    }

    private double f_rek2(int i, int n, int i1, int i2) {
        if (i == n) return i1;
        return i1 + 1.0 / f_rek2(i + 1, n, i1 + i2, i2 + 1);
    }
}
