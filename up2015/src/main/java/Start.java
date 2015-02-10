import stringovi.Stringovi;

/**
 * Created by paleksic on 2/8/2015.
 * paleksic083@gmail.com
 */
public class Start {
    public static void main(String[] args) {
        char[] s;
        char[] p = new char[100];
        char[] d;
        char[] t;
        String ss = "ADFRTRGHRTHFD";
        s=ss.toCharArray();

        Stringovi str = new Stringovi();
        Stringovi.zad14 zd = str.new zad14();

        zd.zadatak14(s);
        for (int i = 0; i < zd.getT().length; i++) {
            System.out.printf("%c", zd.getT()[i]);
        }




    }
}
