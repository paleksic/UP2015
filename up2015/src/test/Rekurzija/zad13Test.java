package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad13Test {
    double sum = 1.433157;
    int i = 1;
    int n = 12;

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(sum == funkcije.Round.round(new zad13().f_iter(n), 6));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(sum == funkcije.Round.round(new zad13().f_rek(i, n), 6));
    }

    @Test
    public void testF_rekF_iter() throws Exception {
        Assert.assertTrue(funkcije.Round.round(new zad13().f_iter(n), 6) == funkcije.Round.round(new zad13().f_rek(i, n), 6));
    }
}