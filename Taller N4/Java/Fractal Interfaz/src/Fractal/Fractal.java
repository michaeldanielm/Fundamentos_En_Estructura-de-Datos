
package Fractal;

import java.util.Random;

/**
 *
 * @author Michael Daniel Murillo López
 * ID 534830
 * Corporacion Universitaria Minuto de Dios
 */
public class Fractal {
public int[][] fractal(int length) {
        //Create a square matrix based on the "length" parameter
        Random ram = new Random();

        int M[][] = new int[length][length];
        int n = M.length;
        int mitad = n / 2;
        int[] rule = {0, 1, 1, 1, 0, 1, 1, 0};
        for (int j = 0; j < n; j++) {
            M[0][j] = ram.nextInt(n);
            if (M[0][j] > mitad) {
                M[0][j] = 1;
            } else {
                M[0][j] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    M[i][j] = rule[(M[i - 1][j] * 2) + (M[i - 1][j + 1] * 1)];
                } else {
                    if (j == n - 1) {
                        M[i][j] = rule[(M[i - 1][j - 1] * 4) + (M[i - 1][j] * 2)];
                    } else {
                        M[i][j] = rule[(M[i - 1][j - 1] * 4) + (M[i - 1][j] * 2) + (M[i - 1][j + 1]) * 1];
                    }
                }
            }
        }

        return M;
    }    
}
