package Rekurzija;

import org.junit.Assert;
import org.junit.Test;

public class zad05Test {
    double sum = 1.7585878999825357;
    int n = 12;
    int i = 1;

    @Test
    public void testF_iter() throws Exception {
        zad05 z = new zad05();
        Assert.assertTrue(sum == z.f_iter(n));
    }

    @Test
    public void testF_rek() throws Exception {
        zad05 z = new zad05();
        Assert.assertTrue(sum == z.f_rek(i, n));
    }

    @Test
    public void testF_rek_F_iter() throws Exception {
        zad05 z = new zad05();
        Assert.assertTrue(z.f_iter(n) == z.f_rek(i, n));
    }
}