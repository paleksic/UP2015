package Rekurzija;

/**
 * Created by paleksic on 2/16/2015.
 * paleksic083@gmail.com
 */
public class zad09 implements rekurzija2 {
    @Override
    public double f_iter(int a, int n) {
        int i;
        int start=a+1;
        int pozicija=start;
        int smer=+1;
        double sum=a;
        for(i=n-1 ; i>0 ; i--){
            if(i==n/2+1) smer = -1;
            if(pozicija==start-1) smer = +1;
            sum=pozicija+1.0/sum;
            pozicija+=smer;
        }
        return sum;
    }

    @Override
    public double f_rek(int a, int n) {
        int i=1;
        int min=a;
        int max=n/2+1;
        int pozicija=min;
        int smer=+1;
        return f_rek2(a,n,i,pozicija,smer,min,max);
    }

    private double f_rek2(int a, int n,int i, int pozicija, int smer, int min, int max) {
        if(pozicija==min) smer=+1;
        if(i==max) smer=-1;
        if(i==n) return a;
        return pozicija+1.0/f_rek2(a,n,i+1,pozicija+smer,smer,min,max);
    }
}
