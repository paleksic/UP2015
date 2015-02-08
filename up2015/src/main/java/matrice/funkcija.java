package matrice;

/**
 * Created by paleksic on 2/3/2015.
 */
public class funkcija {
    private static final funkcija ourInstance = new funkcija();

    private funkcija() {
    }

    public static funkcija getFunkcije() {
        return ourInstance;
    }

    public void ispisiNiz(int[][] niz, int n, int m) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\n");
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", niz[i][j]);
            }
        }
    }
}
