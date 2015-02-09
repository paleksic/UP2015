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
        String ss = "ABCDab";
        s=ss.toCharArray();
        Stringovi.getStringovi().zad11(s,3);

        for (int i = 0; i < p.length; i++) {
            System.out.printf("%c\n",p[i]);
        }


    }
}
