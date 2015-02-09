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
        Stringovi.getStringovi().zad09(s,p);

        int i=0;
        System.out.println(p.length);
        while (p[i]!='\0') {
            System.out.printf("%c\n",p[i]);
            i++;//
        }


    }
}
