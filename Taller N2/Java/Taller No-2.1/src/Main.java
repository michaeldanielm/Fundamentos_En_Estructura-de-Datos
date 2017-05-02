
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López
 * ID:534830
 */
/*Dado un arreglo A de numeros enteros no negativos, encuentre la mınima distancia entre dos elementos
  distintos en A. La mınima distancia de dos elementos p y q, donde p 6= q, es definida como d = |A[p] − A[q]|
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main Min = new Main();
        int Arreglo[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        int n = Arreglo.length;
        int p = 5;
        int q = 45;
 
        System.out.println("Distancia Mínima Entre " + p + " Y " + q 
                + " es " + Min.MinimaDistancia(Arreglo, n, p, q));
    }
    int MinimaDistancia(int Arreglo[], int n, int p, int q) 
    {
        int i, j;
        int MinDist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if ((p == Arreglo[i] && q == Arreglo[j]
                    || q == Arreglo[i] && p == Arreglo[j])
                    && MinDist > Math.abs(i - j)) 
                    MinDist = Math.abs(i - j);
            }
        }
        return MinDist;
    }
}
