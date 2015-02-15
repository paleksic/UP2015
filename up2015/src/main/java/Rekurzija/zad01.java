package Rekurzija;

/**
 * Created by paleksic on 2/15/2015.
 * paleksic083@gmail.com
 */
public class zad01 implements rekurzija {

    public int f_pomoc(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return (int) Math.pow(f_pomoc(n-1),2);
    }

    @Override
    public double f_iter(int n) {
        int i;
        double sum=f_pomoc(n);
        for (i = n-1; i > 0 ; i--) {
            sum=f_pomoc(i)+1.0/sum;
        }
        return sum;
    }

    @Override
    public double f_iter(int i, int m) {
        return 0;
    }

    @Override
    public double f_rek(int i, int n) {
        if(i==n) return f_pomoc(n);
        return f_pomoc(i)+1.0/f_rek(i+1,n);
    }
}
