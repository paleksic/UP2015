package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad01Test {

    double rez = 1.4452052962418191;
    int x = 6;
    zad01 z = new zad01();

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(rez == z.f_iter(x));
        Assert.assertTrue(z.f_rek(1, x) == z.f_iter(x));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(rez == z.f_rek(1, x));
    }

    @Test
    public void testF_rekF_iter() throws Exception {
        Assert.assertTrue(z.f_rek(1, x) == z.f_iter(x));
    }
}