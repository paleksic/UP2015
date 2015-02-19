package Rekurzija;
import org.junit.Assert;
import org.junit.Test;
import start.Start;

public class zad11Test {
    Start s = new Start();
    private double sum=21.058561;
    zad11 z = new zad11();
    private int n=21;
    private int k=4;

    @Test
    public void testF_iter() throws Exception {
        Assert.assertTrue(sum == s.round(z.f_iter(k,n),6));
    }

    @Test
    public void testF_rek() throws Exception {
        Assert.assertTrue(sum == s.round(z.f_rek(k, n),6));
    }

    @Test
    public void testovi() throws Exception {
        Assert.assertTrue(z.f_iter(k,n) == z.f_rek(k,n));
    }
}