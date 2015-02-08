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
        String ss = "ABCD";
        s=ss.toCharArray();
        Stringovi.getStringovi().zad08(s,p);
        System.out.println(new String(p).trim());

    }
}
