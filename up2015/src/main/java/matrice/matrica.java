package matrice;

/**
 * Created by paleksic on 2/3/2015.
 */
public class matrica {
    private static final matrica ourInstance = new matrica();

    private matrica() {
    }

    public static matrica getMatrice() {
        return ourInstance;
    }

    public void popuniNiz(int[][] niz, int n, int m) {
        int broj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((broj / 3) + 1) > 9) broj = 0;
                niz[i][j] = (broj / 3) + 1;
                broj++;
            }
        }
    }
}
