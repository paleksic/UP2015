package stringovi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by paleksic on 2/4/2015.
 */
@SuppressWarnings({"UnusedDeclaration", "UnusedAssignment", "ForLoopReplaceableByForEach"})

public class Stringovi {
    private static final Stringovi ourInstance = new Stringovi();

    public Stringovi() {
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
        ArrayList<String> reci = new ArrayList<>();
        Collections.addAll(reci, str.split(" "));
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
        novi[(i += 1)] = '\0';
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
        prvi[(p += 1)] = '\0';
        drugi[(d += 1)] = '\0';
        treci[(t += 1)] = '\0';
    }

    /**
     * 8. Napisati funkciju koja sva slova iz prvog stringa menja u brojeve u drugom stringu tako da je: A=1, B=2, C=3,...
     * primer: ABCMN
     * resenje: 1-2-3-13-14
     * <p>
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
     * @param ulaz  prima ulazni string koji se treba kodirati
     * @param izlaz kodirani string
     */
    public void zad09(char[] ulaz, char[] izlaz) {
        //a=65-1
        int brojac = 0;
        for (char c : ulaz) {
            int broj = c - 64;
            if (broj < 10) {
                izlaz[brojac++] = (char) (broj + '0');
            } else {
                izlaz[brojac++] = (char) (broj / 10 + '0');
                izlaz[brojac++] = (char) (broj % 10 + '0');
            }
            izlaz[brojac] = '\0';
        }
    }

    /**
     * Funkcija koja vraca samo ona slova u rastucem poretku
     * Primer: ANANAS JE UKUSAN
     * Rezultat: ANNSUU
     *
     * @param ulaz prima niz char[] kao ulaz
     * @return duzina niza
     */
    public int zad10(char[] ulaz) {
        int i, j;
        j = 0;

        int max = 0;
        for (i = 0; i < ulaz.length; i++) {
            if (ulaz[i] >= max) {
                max = ulaz[i];
                ulaz[j] = (char) max;
                j++;
            }
        }
        return j + 1;
    }

    /**
     * Funkcija koja sva velika slova pomera za K mesta unapred a sva mala slova za K mesta unazad
     *
     * @param ulaz String koji se kodira
     * @param k    broj pomeraja
     * @return vraca char[] kodirani niz
     */
    public char[] zad11(char[] ulaz, int k) {
        int i;
        for (i = 0; i < ulaz.length; i++) {
            if (ulaz[i] >= 'A' && ulaz[i] <= 'Z') {
                ulaz[i] = (char) ('A' + (ulaz[i] - 'A' + k) % 26);
            } else if (ulaz[i] >= 'a' && ulaz[i] <= 'z') {
                ulaz[i] = (char) ('z' + (ulaz[i] - 'z' - k) % 26);
            }
        }
        return ulaz;
    }

    /**
     * Funkica koja ispituje da li je string palindrom
     * Primer: MADAM
     * Resenje: Jeste palindrom
     *
     * @param ulaz Ulazni string
     * @return Vraca true ako je palindrom , false ako nije
     */
    public boolean zad12(char[] ulaz) {
        char[] palindrom = new char[ulaz.length];
        int brojac = 0;
        for (int i = ulaz.length - 1; i >= 0; i--) {
            palindrom[brojac++] = ulaz[i];
        }
        return Arrays.equals(ulaz, palindrom);

    }

    /**
     * Funkcija koja ispisuje sva slova iz recenice koja se pojavljuju samo jednom
     * <b>Primer</b> : DANAS JE LEP DAN
     * <b>Resenje</b> : DANSJELP
     *
     * @param ulaz String za ulaz
     */
    public void zad13(char[] ulaz) {
        int[] brojSlova = new int[256];
        Arrays.fill(brojSlova, 0);

        for (int i = 0; i < ulaz.length; i++) {
            int slovoBroj = ulaz[i];
            brojSlova[slovoBroj]++;
        }
        for (int i = 0; i < ulaz.length; i++) {
            if (ulaz[i] == ' ') brojSlova[ulaz[i]] = 0;
            if (brojSlova[ulaz[i]] >= 1) {
                System.out.printf("%c", ulaz[i]);
                brojSlova[ulaz[i]] = 0;
            }
        }
    }

    /**
     * Funkcija koja pravi novi string koji se sastoji samo
     * od cifara koje se nisu ponavljale . String treba da
     * sadrzi cifre u originalnom
     * redosledu
     * primer: 11223455
     * resenje: 34
     *
     * @param ulaz Ulazni string
     */
    public void zad15(char[] ulaz) {
        int[] brSlova = new int[10];
        Arrays.fill(brSlova, 0);
        for (char br : ulaz) {
            brSlova[br - '0']++;
        }
        int n = 0;
        char[] novi = new char[100];
        for (char c : ulaz) {
            if (brSlova[c - '0'] == 1) {
                novi[n++] = c;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%c", novi[i]);
        }
    }

    public void zad16(char[] ulaz) {
        char[][] reci = new char[10][10];
        int i = 0;
        //noinspection UnusedAssignment
        int j = 0;
        int k = 0;
        for (char c : ulaz) {
            if (c != ' ') {
                reci[i][k++] = c;
                continue;
            }
            i++;
            k = 0;
        }
        /** FIXME algoritam**/
      /*  int n = i + 1;
        int brojac=0;
        for (int i1 = 0; i1 < n; i1++) {
            j=i1+1;
            k=i1+1;
            for( ; j < n  ; j++){
                if(!Arrays.equals(reci[j],reci[i1])){
                    reci[k]=reci[j];
                    k++;
                }

            }
        }*/
    }

    /**
     * Funkcija koja string koji se sastoji samo od cifara vecih
     * od nula, modifikuje tako da izmedju scifara koje se ponavljaju
     * ubacuje nula.
     * Primer: 122334
     * Resenje: 12023034
     *
     * @param ulaz Ulazni string
     */
    @SuppressWarnings("ManualArrayCopy")
    public void zad17(char[] ulaz) {
        char[] novi;
        novi = Arrays.copyOf(ulaz, 100);
        int n = ulaz.length;
        /* algoritam za ubacivanje */
        for (int i = 0; i < n - 1; i++) {
            if (novi[i] == novi[i + 1]) {
                for (int j = n; j > i + 1; j--) {
                    novi[j] = novi[j - 1];
                }
                novi[i + 1] = '0';
                n++;
                i++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%c", novi[i]);
        }

    }

    /**
     * Ispituje da li u drugom stringu ima dovoljno slova da
     * se formira rec iz ulaznog stringa
     * primer: "beograd"
     * slova: "bordega"
     * resenje: "Ima dovoljno slova"
     *
     * @param ulaz  ulazni char[] array
     * @param slova slova char[] kojim se testira ulazi string
     * @return vraca true ukoliko ima dovoljno slova, vraca false ukoliko nema
     */
    public boolean zad19(char[] ulaz, char[] slova) {
        int[] brUlaz = new int[256];
        Arrays.fill(brUlaz, 0);
        int[] brSlova = new int[256];
        Arrays.fill(brSlova, 0);
        for (char c : ulaz) {
            brUlaz[c]++;
        }
        for (char c : slova) {
            brSlova[c]++;
        }
        for (int i = 0; i < brUlaz.length; i++) {
            if (brSlova[i] < brUlaz[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Funkcija koja sabira sve brojeve u stringu
     * Primer: ana20marija30tanja12
     * Resenje: 62
     *
     * @param ulaz ulazni string
     * @return vraca zbir brojeva
     */
    public int zad20(char[] ulaz) {
        int rez = 0;
        int broj = 0;
        int brojac = 0;
        for (int i = ulaz.length - 1; i > 0; i--) {
            if (ulaz[i] >= '0' && ulaz[i] <= '9') {
                int cf = ulaz[i] - '0';
                broj += cf * Math.pow((double) 10, (double) brojac++);
                continue;
            }
            rez += broj;
            broj = 0;
            brojac = 0;
        }
        return rez;
    }

    /**
     * Funkcija koja izvrsava sve racuske operacije u stringu
     * Primer: ana20marija30tanja-12
     * Resenje: 38
     *
     * @param ulaz ulazni string
     * @return vraca zbir brojeva
     */
    public int zad23(char[] ulaz) {
        int rez = 0;
        int broj = 0;
        int brojac = 0;
        for (int i = ulaz.length - 1; i > 0; i--) {
            if (ulaz[i] >= '0' && ulaz[i] <= '9') {
                int cf = ulaz[i] - '0';
                broj += cf * Math.pow((double) 10, (double) brojac++);
                continue;
            }
            if (ulaz[i] == '-' && Character.isDigit(ulaz[i + 1])) broj *= -1;
            rez += broj;
            broj = 0;
            brojac = 0;
        }
        return rez;
    }

    /**
     * Funkcija koja nalazi najmanji broj u  stringu
     * Primer: ana20marija30tanja-12
     * Resenje: -12
     *
     * @param ulaz ulazni string
     * @return vraca najmanji broj
     */
    public int zad24(char[] ulaz) {
        int broj = 0;
        int brojac = 0;
        int min = Integer.MAX_VALUE;
        for (int i = ulaz.length - 1; i > 0; i--) {
            if (ulaz[i] >= '0' && ulaz[i] <= '9') {
                int cf = ulaz[i] - '0';
                broj += cf * Math.pow((double) 10, (double) brojac++);
                continue;
            }
            if (ulaz[i] == '-' && Character.isDigit(ulaz[i + 1])) broj *= -1;
            if (broj < min) min = broj;
            broj = 0;
            brojac = 0;
        }
        return min;
    }

    /**
     * Funkcija koja pronalazi najduzu rec i ispisuje na ekran
     * ako ih ima vise isprisuje ih sve
     * Primer AA-BBB-CC
     * Rezultat BBB
     * @param ulaz korisnik unosi string (samo velika slova)
     */
    public void zad25(char[] ulaz) {
        char[][] reci = new char[100][100];
        int i = 0;
        //noinspection UnusedAssignment
        int j = 0;
        int k = 0;
        char[] max;
        //noinspection UnusedAssignment
        int kNiz[] = new int[100];
        for (int b = 0; b < ulaz.length; b++) {
            if (ulaz[b] != '-') {
                reci[i][k++] = ulaz[b];
                continue;
            }
            reci[i][k++] = '\0';
            i++;
            k = 0;
        }

        //noinspection UnusedAssignment
        int brojac = 0;
        max = reci[0].clone();
        /** Algoritam koji pronalazi najduzu rec**/
        for (int l = 1; l < reci.length && l <= i; l++) {
            if (strlen(reci[l]) > strlen(max)) {
                max = reci[l].clone();
            }
        }
        for (int i1 = 0; i1 < reci.length && i1 <= i; i1++) {
            if (strlen(max) == strlen(reci[i1])) {
                System.out.println(reci[i1]);
            }
        }


    }
    /**
     * Funkcija koja pronalazi najveci broj i ispisuje na ekran
     * ako ih ima vise isprisuje ih sve
     * Primer 14-13-4+231+2
     * Rezultat 231
     * @param ulaz korisnik unosi string (samo velika slova)
     */
    public void zad26(char[] ulaz){
        int max=Integer.MIN_VALUE;
        int broj=0;
        int stepen=0;
        int j=0;
        int[] brojevi=new int[100];
        for (int i = ulaz.length-1; i >= 0; i--) {
            if(ulaz[i]>='0' && ulaz[i]<='9'){
                int cf=ulaz[i]-'0';
                broj+=cf*Math.pow((double)10,(double)stepen++);
                continue;
            }
            if(ulaz[i]=='-' && (ulaz[i+1]>='0' && ulaz[i+1]<='9')) broj*=-1;

            brojevi[j++]=broj;
            broj=0;
            stepen=0;
        }
        for (int i = 0; i < brojevi.length; i++) {
            if(brojevi[i]>max) max=brojevi[i];
        }
        int tmp=0;
        for (int i = 0; i < brojevi.length; i++) {
            if(max==brojevi[i]) tmp++;
        }
        System.out.printf("%d pojavio se %d puta",max,tmp);
    }
    public class zad14 {
        /**
         * Deli string na dva nova identicna stringa
         * Slova u stringu su u rastucem redosledu
         * Neupotrebljena slova , kad ih nema paran broj
         * su smestena u trecem stringu
         * <p>primer : ADFRTRGHRTHFD
         * resenje: DFHRT,DFHRT,AGR</p>
         */
        private char[] p = new char[100];
        private char[] d = new char[100];
        private char[] t = new char[100];
        private int pr = 0, dr = 0, tr = 0;

        public int getPr() {
            return pr;
        }

        public int getDr() {
            return dr;
        }

        public int getTr() {
            return tr;
        }

        public char[] getP() {
            return p;
        }

        public char[] getD() {
            return d;
        }

        public char[] getT() {
            return t;
        }

        public void zadatak14(char[] s) {
            int[] brSlova = new int[256];
            Arrays.fill(brSlova, 0);
            for (char c : s) {
                brSlova[c]++;
            }
            for (int i = 0; i < brSlova.length; i++) {
                if (brSlova[i] % 2 == 1) {
                    t[tr++] = (char) (i);
                } else {
                    if (brSlova[i] > 1) {
                        brSlova[i] -= 2;
                        p[pr++] = (char) i;
                        d[dr++] = (char) i;
                    }
                }
            }
        }
    }

    //pomocna funkcija da bi licilo na C programski jezik
    // java nema nullable char[] array
    public int strlen(char[] ulaz) {
        //noinspection UnusedAssignment
        int m = 0;
        //noinspection StatementWithEmptyBody
        for (m = 0; m < ulaz.length && ulaz[m] != '\0'; m++) ;
        return m;
    }
}
