package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad04Test {
    int n = 50;
    double sum = 50.039868852459016;

    @Test
    public void testF_rek() throws Exception {
        zad04 z = new zad04();
        Assert.assertTrue(sum == z.f_rek(n));
    }

    @Test
    public void testF_iter() throws Exception {
        zad04 z = new zad04();
        Assert.assertTrue(sum == z.f_iter(n));
    }

    @Test
    public void testF_iterF_rek() throws Exception {
        zad04 z = new zad04();
        Assert.assertTrue(z.f_iter(n) == z.f_iter(n));
    }
}