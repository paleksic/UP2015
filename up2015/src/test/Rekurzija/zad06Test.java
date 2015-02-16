package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad06Test {
    double sum=2.453033855300216;
    int broj=372;
    int n=6;

    @Test
    public void testF_iter() throws Exception {
        zad06 z= new zad06();
        Assert.assertTrue(sum==z.f_iter(broj, n));
    }

    @Test
    public void testF_rek() throws Exception {
        zad06 z = new zad06();
        Assert.assertTrue(sum==z.f_rek(broj,n));
    }
    @Test
    public void testF_rekF_iter() throws Exception {
        zad06 z = new zad06();
        Assert.assertTrue(z.f_iter(broj,n)==z.f_rek(broj,n));
    }
}