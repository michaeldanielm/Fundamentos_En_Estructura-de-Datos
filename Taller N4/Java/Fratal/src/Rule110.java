/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
class Rule110 {
    public void fractal() {
        int n = 30;
        int a[][] = new int[n][n];
        int[] rule = {0, 1, 1, 0, 1, 1, 1, 0};//Regla 110 del automata celular

        for (int j = 0; j < n; j++) {
            a[0][j] = Math.random() < 0.5 ? 0 : 1;//La primera fila va en random 
        }

        for (int i = 1; i < n; i++) {//Despues de la segunda linea, los numeros son dirigidos segun la regla
            for (int j = 0; j < n; j++) {

                if (j == 0) {//Se determina el lugar izquierdo del vector cuando no hay numeros
                    a[i][j] = rule[(a[i - 1][j] * 2) + (a[i - 1][j + 1] * 1)];

                } else if (j == n - 1) {//Se determina el lugar derecho cuando no existen numeros
                    a[i][j] = rule[(a[i - 1][j - 1] * 4) + (a[i - 1][j] * 2)];
                } else {
                    a[i][j] = rule[(a[i - 1][j - 1] * 4) + (a[i - 1][j] * 2) + (a[i - 1][j + 1] * 1)];
                }

                //System.out.print(a[i][j]);
            }
           // System.out.println("");
        }
    }
}
