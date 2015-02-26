package Rekurzija;

/**
 * Created by paleksic on 2/20/2015.
 * paleksic083@gmail.com
 */
public class zad13 implements rekurzija {
    public boolean isDelilac(int broj, int delilac) {
        if (broj % delilac == 0) return true;
        return false;
    }

    @Override
    public double f_iter(int n) {
        int i;
        double sum = n;
        for (i = n - 1; i > 0; i--) {
            if (isDelilac(n, i)) sum = i + 1.0 / sum;
        }
        return sum;
    }

    @Override
    public double f_rek(int i, int n) {
        if (i == n) return n;
        if (isDelilac(n, i)) return i + 1.0 / f_rek(i + 1, n);
        return f_rek(i + 1, n);
    }
}
