/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López
 * iD:534830
 */

import java.util.Scanner;

/*
- Dada una matriz cuadrada de M de tamaño m*m, 
la cual almacena numeros enteros ingresados de 
forma manual por el usuario (sucesion de numeros 
separados por comas) y siendo m un parametro, 
calcule la transpuesta de la matriz m, es decir, Mt. 
La definición formal de la transpuesta de la matriz: 
todo elemento aij E M, sera el elemento aji E mt.
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la dimension de la matriz m*m");
        int m=leer.nextInt();
        int Matriz[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Digite un numero para la posicion "+i+"-"+j+": ");
                Matriz[i][j]=leer.nextInt();
            }
        }
        System.out.println("Matriz Ingresada");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + Matriz[i][j] + "|");
            }
            System.out.println("");
        }
        int MatrizT[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                MatrizT[i][j]=Matriz[j][i];
            }
        }
        System.out.println("Transpuesta");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + MatrizT[i][j] + "|");
            }
            System.out.println("");
        }
    }
    
}
