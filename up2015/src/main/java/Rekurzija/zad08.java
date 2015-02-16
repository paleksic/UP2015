package Rekurzija;

/**
 * Created by paleksic on 2/16/2015.
 * paleksic083@gmail.com
 */

// 3 4 5 4 3
// 345 5
public class zad08 implements rekurzija2 {
    @Override
    public double f_iter(int broj, int n) {
        int brCifri=(int) (Math.floor(Math.log10(broj)));
        int max=brCifri;
        int min=0;
        int smer=-1;
        int pozicija=max;
        double sum=0.0;
        int i;
        for(i=n ; i>0 ; i--){
            if(pozicija==min) smer=+1;
            if(pozicija==max) smer=-1;
            int cifra= (int) (broj/(Math.pow(10,pozicija)))%10;
            sum=Math.sqrt(cifra+sum);
            pozicija+=smer;
        }
        return sum;
    }

    @Override
    public double f_rek(int broj, int n) {
        int brCifri=(int) (Math.floor(Math.log10(broj)));
        return f_rek2(broj,n,brCifri,-1,0,brCifri);
    }

    private double f_rek2(int broj, int n, int pozicija, int smer, int min, int max) {
        if(pozicija==max) smer=-1;
        if(pozicija==min) smer=+1;
        int cifra= (int) (broj/(Math.pow(10,pozicija)))%10;
        if(n==1) return Math.sqrt(cifra);
        return Math.sqrt(cifra+f_rek2(broj,n-1,pozicija+smer,smer,min,max));
    }
}
