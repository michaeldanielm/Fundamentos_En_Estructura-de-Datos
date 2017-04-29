
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López 
 *  ID:534830
 * 
 */
public class BusquedaporInterpolacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Busqueda por Interpolation\n ");
        int n, i;
        /**
         * Aceptar el número de elementos  *
         */
        System.out.println("Ingrese el número de elementos enteros\n");
        n = scan.nextInt();
        /**
         * Crear matriz de números enteros en n elementos *
         */
        int arr[] = new int[n];
        /**
         * Aceptar elementos*
         */
        System.out.println("Entrar " + n + " Elementos enteros clasificados");
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("\nIntroduzca el elemento para buscar: ");
        int key = scan.nextInt();

        int result = BusquedaInterpolacion(arr, key);

        if (result == -1) {
            System.out.println("\n" + key + "Elemento no encontrado");
        } else {
            System.out.println("\n" + key + " Elemnt encontrado en la posición " + result);
        }

    }

    /**
     * Busqueda Interpolacion  *
     */
    public static int BusquedaInterpolacion(int[] ordenarArray, int encortar) {
        int bajo = 0;
        int alto = ordenarArray.length - 1;
        int medio;
        while (ordenarArray[bajo] <= encortar && ordenarArray[alto] >= encortar) {
            if (ordenarArray[alto] - ordenarArray[bajo] == 0) {
                return (bajo + alto) / 2;
            }
            /**
             * Fuera de rango es posible aquí *
             */
            medio = bajo + ((encortar - ordenarArray[bajo]) * (alto - bajo)) / (ordenarArray[alto] - ordenarArray[bajo]);

            if (ordenarArray[medio] < encortar) {
                bajo = medio + 1;
            } else if (ordenarArray[medio] > encortar) {
                alto = medio - 1;
            } else {
                return medio;
            }
        }
        if (ordenarArray[bajo] == encortar) {
            return bajo;
        } else {
            return -1;
        }

    }
}
