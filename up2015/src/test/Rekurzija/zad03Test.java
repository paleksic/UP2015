package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad03Test {
    zad03 z = new zad03();
    int i = 0;
    int n = 5;
    double sum = 1.708860759493671;

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(sum == z.f_iter(n));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(sum == z.f_rek(i, n));
    }

    @Test
    public void testF_rekF_iter() throws Exception {
        Assert.assertTrue(z.f_iter(n) == z.f_rek(i, n));
    }
}