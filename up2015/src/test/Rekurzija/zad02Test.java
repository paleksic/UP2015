package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad02Test {
    double rez=5.162857142857143;
    int m=5;
    int n=8;
    zad02 z = new zad02();

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(rez == z.f_iter(m,n));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(rez == z.f_rek(m, n));
    }

    @Test
    public void testF_rekF_iter() throws Exception {
        Assert.assertTrue(z.f_iter(m,n) == z.f_rek(m,n));
    }
}