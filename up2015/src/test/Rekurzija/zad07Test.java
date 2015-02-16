package Rekurzija;

import org.junit.Test;

public class zad07Test {
    double sum = 2.795677823988331;
    int p = 3;
    int n = 5;

    @Test
    public void testF_rek() throws Exception {
        zad07 z = new zad07();
        org.junit.Assert.assertTrue(sum == z.f_rek(p, n));
    }

    @Test
    public void testF_iter() throws Exception {
        zad07 z = new zad07();
        org.junit.Assert.assertTrue(sum == z.f_iter(p, n));
    }

    @Test
    public void testF_iterF_rek() throws Exception {
        zad07 z = new zad07();
        org.junit.Assert.assertTrue(z.f_rek(p, n) == z.f_iter(p, n));
    }
}