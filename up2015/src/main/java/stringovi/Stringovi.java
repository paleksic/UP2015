package stringovi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by paleksic on 2/4/2015.
 */
public class Stringovi {
    private static final Stringovi ourInstance = new Stringovi();

    private Stringovi() {
    }

    public static Stringovi getStringovi() {
        return ourInstance;
    }

    /**
     * *****************************
     * Napisati najduzu rec u stringu
     * *******************************
     */
    public void zad01(java.lang.String str) {
        java.lang.String max;
        java.lang.String[] token = str.split(" ");
        max = token[0];
        for (java.lang.String s : token) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        System.out.println(max);
    }

    /**
     * Koristik unosi recenicu u string s. Sastaviti i ispisati najveci moguci
     * trocifreni broj koji se moze sastaviti od cifara koje se nalaze u tom stringu,
     * ali tako da broj ima sve cifre razlicite. Napomena: rezultat mora biti broj a ne string!
     * primer: Dana1s je5 le8p d84an
     * rezultat: 854
     */

    public int zad02(char[] s) {
        int brCifra[] = new int[10];
        int suma = 0;
        Arrays.fill(brCifra, 0);

        for (char value : s) {
            if (Character.isDigit(value)) {
                int broj = value - '0';
                brCifra[broj] = 1;
            }
        }
        int tmp = 100;
        for (int i = brCifra.length - 1; i >= 0; i--) {
            if (brCifra[i] == 1) {
                suma += i * tmp;
                tmp /= 10;
                if (tmp == 0) {
                    break;
                }
            }
        }
        return suma;
    }

    /**
     * 5.	 Koristik unosi recenicu u string s. Ispisati rec koja se nalazi
     * u centru recenice. Ako je u centru razmak – ispisati rec pre i posle.
     */
    public void zad05(String str) {
        ArrayList<String> reci = new ArrayList<String>();
        for (String s : str.split(" ")) {
            reci.add(s);
        }
        int n = reci.size() - 1;
        if (n % 2 == 0) {
            System.out.println(reci.get(n / 2));
        } else {
            System.out.println(reci.get(n / 2) + " " + reci.get((n / 2) + 1));
        }
    }

    /**
     * Korsnik string koji sadrzi iskljucivo slova. Napraviti funkciju koja popunjava novi string
     * tako sto kodira ulazni string (broji sukcesivna slova i zapisuje u rezultatu) kao u primeru.
     * Primer:
     * ulaz: xxxaaabbcccc
     * rezultat: 3x3a2b4c
     */
    public char[] zad06(char[] s) {
        char[] novi = new char[100];
        int[] brSlova = new int[256];
        Arrays.fill(brSlova, 0);
        for (char c : s) {
            int broj = c;
            brSlova[broj]++;
        }
        int i = 0;
        for (char c : s) {
            int broj = c;
            if (brSlova[broj] <= 9 && brSlova[broj] > 0) {
                novi[i++] = Character.forDigit(brSlova[broj], 10);
                novi[i++] = c;
                brSlova[broj] = 0;
            } else if (brSlova[broj] > 9) {
                int rez = 0; //123
                while (brSlova[broj] != 0) {
                    rez *= 10;
                    rez += brSlova[broj] % 10;
                    brSlova[broj] /= 10;

                }
                while (rez != 0) {
                    novi[i++] = Character.forDigit(rez % 10, 10);
                    rez /= 10;
                }
                brSlova[broj] = 0;
                novi[i++] = c;
            }
        }
        novi[i++] = '\0';
        return novi;
    }

    /**
     * Korisnik unosi string koji se sastoji samo od cifara . Napisati funkciju koja uneti string deli
     * na dva nova identicna stringa. Cifre u stringovima moraju biti u opadajucem redosledu.
     * Neupotrebljene cifre (kada ih nema paran broj) staviti u treci string.
     * primer: 5784768943789
     * resenje: 9874, 9874, 87653
     */

    public void zad07(char[] s, char[] prvi, char[] drugi, char[] treci) {
        int p = 0;
        int d = 0;
        int t = 0;
        int[] broj = new int[10];
        Arrays.fill(broj, 0);
        for (char c : s) {
            int br = c - '0';
            broj[br]++;
        }
        for (int i = broj.length - 1; i >= 0; i--) {
            if (broj[i] % 2 != 0) {
                treci[t++] = (char) (i + '0');
            }
            while (broj[i] >= 2) {
                prvi[p++] = (char) (i + '0');
                drugi[d++] = (char) (i + '0');
                broj[i] -= 2;
            }
        }
        prvi[p++] = '\0';
        drugi[d++] = '\0';
        treci[t++] = '\0';
    }

    /**
     * 8. Napisati funkciju koja sva slova iz prvog stringa menja u brojeve u drugom stringu tako da je: A=1, B=2, C=3,...
     * primer: ABCMN
     * resenje: 1-2-3-13-14
     * <p/>
     * *
     */

    public void zad08(char[] s, char[] r) {
        int r_i = 0;
        for (int i = 0; i < s.length * 2; i++) {

            if (i % 2 == 0) {
                int broj = ((s[i / 2] - 64));
                if (broj < 10) {
                    r[r_i++] = (char) (broj + '0');
                } else {
                    r[r_i++] = (char) ((broj / 10) + '0');
                    r[r_i++] = (char) ((broj % 10) + '0');
                }
            } else {
                r[r_i++] = '-';
            }
        }
        r[r_i - 1] = '\0';
    }

    /**
     * <b>Zadatak 09<b/>
     * Napisati funkciju koja dobija 2 argumenta tipa string.
     * Funkcija od prvog stringa u kojem su samo slova
     * pravi drugi string tako da svako slovo zameni odgovarajucim brojem:
     * A=1, B=2, C=3 itd.:
     * <p>
     * <b>primer: ABCMN<b/>
     * <b>re?enje: 1231314<b/>
     *
     * @param ulaz prima ulazni string koji se treba kodirati
     * @param izlaz kodirani string
     *
     */
    public void zad09(char[] ulaz, char[] izlaz){
        //a=65-1
        int brojac=0;
        for (char c : ulaz) {
            int broj=c-64;
            if (broj<10) {
                izlaz[brojac++]= (char) (broj+'0');
            } else {
                izlaz[brojac++]= (char) (broj/10+'0');
                izlaz[brojac++]= (char) (broj%10+'0');
            }
            izlaz[brojac]='\0';
        }
    }
    /**
     * Funkcija koja sva velika slova pomera za K mesta unapred a sva mala slova za K mesta unazad
     *             @param ulaz String koji se kodira
     *             @param k broj pomeraja
     *             @return vraca char[] kodirani niz
     */
    public char[] zad11(char[] ulaz, int k){
        int i;
        for (i = 0; i < ulaz.length; i++) {
            if(ulaz[i]>='A' && ulaz[i]<='Z'){
                ulaz[i]= (char) ('A'+(ulaz[i]-'A'+k)%26);
            }else if(ulaz[i]>='a' && ulaz[i]<='z'){
                ulaz[i]= (char) ('z'+(ulaz[i]-'z'-k)%26);
            }
        }
        //ulaz[ulaz.length-1]='\0';
        return ulaz;
    }
    /**
     * Funkica koja ispituje da li je string palindrom
     * Primer: MADAM
     * Resenje: Jeste palindrom
     *       @param ulaz Ulazni string
     *       @return Vraca true ako je palindrom , false ako nije
     */
    public boolean zad12(char[] ulaz){
        char[] palindrom=new char[ulaz.length];
        int brojac=0;
        for (int i = ulaz.length - 1; i >= 0; i--) {
            palindrom[brojac++]=ulaz[i];
        }
        if(Arrays.equals(ulaz,palindrom)==true)
            return true;

        return false;
    }
    /**
     * Funkcija koja ispisuje sva slova iz recenice koja se pojavljuju samo jednom
     * <b>Primer</b> : DANAS JE LEP DAN
     * <b>Resenje</b> : DANSJELP
     */
    public void zad13(char[] ulaz){
        int[] brojSlova= new int[256];
        Arrays.fill(brojSlova,0);

        for (int i = 0; i < ulaz.length; i++) {
            int slovoBroj= ulaz[i];
            brojSlova[slovoBroj]++;
        }
        for (int i = 0; i < ulaz.length; i++) {
            if(ulaz[i]==' ') brojSlova[ulaz[i]] = 0;
            if(brojSlova[ulaz[i]]>=1){
                System.out.printf("%c",ulaz[i]);
                brojSlova[ulaz[i]]=0;
            }
        }
    }

}
