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
        String ss = "MADAM";
        s=ss.toCharArray();
        if(Stringovi.getStringovi().zad12(s)==true)
            System.out.println("Jeste palindrom");
        else
            System.out.println("Nije palindrom");


    }
}
