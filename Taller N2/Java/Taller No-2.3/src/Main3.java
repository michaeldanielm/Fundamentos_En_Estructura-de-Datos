import java.util.*;
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
/**
 * Dado un arreglo A de n numeros enteros no ordenados y un parametro d ∈ Z+, encuentre si existe una
 * pareja de elementos en el arreglo cuya diferencia (resta) sea igual a d; la diferencia debe ser trabajada
 * con valor absoluto. El programa que usted realice debe determinar cuantas parejas cumplen con dicha
 * condici´on.
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Arreglo[] ={1,7,1,7,2,3,4,6,5};
        
        System.out.println("Cuantas Parejas Cumplen Con Dicha\n");

        int d = -1;
        int cont = 0;
        
        for (int i = 0; i < Arreglo.length; i++) {
            

            for (int j = 0; j < Arreglo.length; j++) {

                if (Arreglo[i] - Arreglo[j] == d) {

                    cont++;

                }
            }

            if (cont == 1) {

                System.out.println( "Condición: " + Arreglo[i]);

            }
        }
    }
}