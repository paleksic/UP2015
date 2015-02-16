package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
/*n=6 , m = 372*/
    /* 3 7 2 3 7 2*/
public class zad06 implements rekurzija2 {
    @Override
    public double f_iter(int m, int n) {
        double sum = 0.0;
        int i;
        int tmp = m;
        for (i = 0; i < n; i++) {
            int cf = tmp % 10;
            sum = Math.sqrt(cf + sum);
            tmp /= 10;
            if (tmp <= 0) tmp = m;
        }
        return sum;
    }

    @Override
    public double f_rek(int m, int n) {
        int broj = m;
        int brCifri = (int) Math.floor(Math.log10(broj));
        int pomeraj = brCifri;
        int max = pomeraj;
        return f_rek2(broj, n, pomeraj, -1, max, 0);
    }

    private double f_rek2(int broj, int n, int pozicija, int smerKretanja, int maxPozicija, int minPozicija) {
        if (pozicija < minPozicija) {
            pozicija = maxPozicija;
            smerKretanja = -1;
        }
        int cf = (int) (broj / (Math.pow(10, pozicija))) % 10;
        if (n == 0) return 0;
        return Math.sqrt(cf + f_rek2(broj, n - 1, pozicija + smerKretanja, smerKretanja, maxPozicija, minPozicija));

    }
}
