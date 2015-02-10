import stringovi.Stringovi;

/**
 * Created by paleksic on 2/8/2015.
 */
public class Start {
    public static void main(String[] args) {
        char[] s;
        char[] p = new char[100];
        char[] d;
        char[] t;
        String ss = "ANANAS JE UKUSAN";
        s=ss.toCharArray();
        int k= Stringovi.getStringovi().zad10(s);
        for ( int i=0 ; i < k; i++) {
            System.out.println(s[i]);
        }


    }
}
