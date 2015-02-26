package Rekurzija;

/**
 * Created by paleksic on 2/26/2015.
 * paleksic083@gmail.com
 */

// 1 6 2 5 3 4
//  5 4 3 2 1
public class zad16 implements rekurzija {
    @Override
    public double f_iter(int n) {
        int i, j = 1, k = n - 1;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 1) j += k--;
            else j -= k--;
        }
        double sum = j;
        k = 1;
        for (i = n - 1; i > 0; i--) {
            if (i % 2 == 1) sum = (j -= k++) + 1.0 / sum;
            else sum = (j += k++) + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        return f_rek2(i, n, 1, n - 1);
    }

    private double f_rek2(int i, int n, int a, int b) {
        if (i == n) return a;
        if (i % 2 == 1) {
            return a + 1.0 / f_rek2(i + 1, n, a + b, b - 1);
        } else return a + 1.0 / f_rek2(i + 1, n, a - b, b - 1);
    }
}
