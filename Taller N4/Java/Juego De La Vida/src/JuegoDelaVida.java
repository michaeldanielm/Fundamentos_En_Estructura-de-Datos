/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class JuegoDelaVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = new int[20][20];
        int n = A.length;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%2d", A[i][j]);
            }
            System.out.println("");
        }

        int contador = 0;
        while (true) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    contador = A[(i - 1 + n) % n][(j - 1 + n) % n] + A[(i - 1 + n) % n][1]
                            + A[(i - 1 + n) % n][(j + 1) % n] + A[i][(j - 1 + n) % n]
                            + A[i][(j + 1) % n] + A[(i + 1) % n][(j - 1 + n) % n]
                            + A[(i + 1) % n][j] + A[(i + 1) % n][(j + 1) % n];

                    if (A[i][j] == 1) {//vivo
                        if (contador < 2 || contador > 3) {
                            A[i][j] = 0;
                        }
                    } else {
                        if (contador == 3) {
                            A[i][j] = 1;
                        }
                    }// fin vivo o muerto
                }//fin for j
            }// fin for i 
            System.out.println("");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.printf("%2d", A[i][j]);
                }// fin for j
                System.out.println("");
            }// fin for i

        }
    }// fin while

}
