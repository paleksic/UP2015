package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad04 implements rekurzija {
    int niz[] = new int[100];

    public int napuniNiz(int n, int k) {
        if (n < 1) return k;
        niz[k] = n;
        return napuniNiz(n / 2, k + 1);
    }

    public double f_rek(int n) {
        if (n == 1) return 1;
        return n + 1.0 / f_rek(n / 2);
    }

    @Override
    public double f_iter(int n) {
        int k = napuniNiz(n, 0);
        int i;
        k -= 1;
        double sum = niz[k];
        for (i = k - 1; i >= 0; i--) {
            sum = niz[i] + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        return 0;
    }

}