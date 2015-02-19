package Rekurzija;
/**
 * Created by paleksic on 2/16/2015.
 * paleksic083@gmail.com
 */
public class zad11 implements rekurzija2 {
    @Override
    public double f_iter(int k, int n) {
        double sum=1.0;
        int i;
        for(i = k+1 ; i<=n ; i+=k) sum=i+1.0/sum;
        return sum;
    }

    @Override
    public double f_rek(int k, int n) {
        if(n==1) return 1.0;
        return n+1.0/f_rek(k,n-k);
    }
}
