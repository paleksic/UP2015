package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad07 implements rekurzija2 {
    @Override
    public double f_iter(int p, int n) {
        int i;
        int a = n;
        int b = 0;
        double sum = 0.0;
        int niz[] = new int[n];
        for (i = 0; i < n; i++) {
            if (i == 0) niz[i] = (a = n);
            else if (i % 2 == 0) niz[i] = (a += b++);
            else niz[i] = (a -= b++);
        }
        for (i = niz.length - 1; i >= 0; i--) sum = Math.sqrt(niz[i] + sum);
        return sum;
    }

    @Override
    public double f_rek(int p, int n) {
        return f_rek2(p, n, 0, 1, n);
    }

    private double f_rek2(int p, int n, int a, int i, int b) {
        if (a > p) a = 0;
        if (i > n) return 0.0;
        if (i % 2 == 0) return Math.sqrt(b + f_rek2(p, n, a + 1, i + 1, b + a));
        else return Math.sqrt(b + f_rek2(p, n, a + 1, i + 1, b - a));
    }
}
