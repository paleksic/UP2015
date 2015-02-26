package Rekurzija;

import funkcije.Round;
import org.junit.Assert;
import org.junit.Test;

public class zad14Test {
    double sum = 1.446133;
    int n = 6;
    int i = 1;

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(sum == Round.round(new zad14().f_iter(n), 6));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(sum == Round.round(new zad14().f_rek(i, n), 6));
    }
}