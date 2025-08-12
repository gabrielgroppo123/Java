public class Somamatriz {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int linhas = a.length;
        int colunas = a[0].length;

        int[][] c = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
