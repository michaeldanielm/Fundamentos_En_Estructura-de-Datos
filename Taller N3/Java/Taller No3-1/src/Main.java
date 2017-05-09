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
import java.util.Random;
import java.util.Scanner;

/*
- Dada una matriz cuadrada M de tamaño m*m, la cual 
almacena numeros enteros generados de forma aleatoria 
y siendo m un parametro, imprima todos los numeros que
corresponden al rombo generado al interior de la matriz

 */
public class Main {

    private static void Main(int h) {

        if (h % 2 != 0) {
            int size = h / 2 + 1;
            int contar = 1;
            int loop = 1;
            String[][] diamante = new String[h][];
            for (int fila = 0; fila < diamante.length; fila++) {

                diamante[fila] = new String[fila + 1];

                for (int columna = 0; columna <= fila; columna++) {

                    diamante[0][0] = "1";

                    for (int i = 0; i < loop; i++) {

                        diamante[fila][columna] += contar;

                    }

                }
                contar++;
                loop += 2;

            }

            for (int i = 0; i < size; i++) {
                System.out.printf("%" + h + "s", diamante[i]);
                h++;
                System.out.println();
            }
            h--;
            for (int j = size - 2; j >= 0; j--) {
                h--;
                System.out.printf("%" + h + "s", diamante[j]);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {

        Main(9);

    }
}
/*public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner leer = new Scanner(System.in);
        int m = 8;
        int l1 = m / 2, l2 = m / 2;
        if(m%2==0){
            l2++;
        }
        int Matriz[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                Matriz[i][j] = (int) (r.nextFloat() * 100);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + Matriz[i][j] + "|");
            }
            System.out.println("");
        }

        for (int i = 0; i < m; i++) {
            for (int j = l1; j < l2; j++) {
                
            }
        }

    }

}*/
