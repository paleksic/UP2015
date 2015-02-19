package Rekurzija;

/**
 * Created by paleksic on 2/17/2015.
 * paleksic083@gmail.com
 */
public class zad12 {
    public double f_iter(int a,int b, int n){
        int i;
        double sum=(n%2==1) ? a:b;
        for(i=n-1 ; i>0 ; i--){
            if(i%2==1) sum=a+1.0/sum;
            else sum=b+1.0/sum;
        }
        return sum;
    }
}
