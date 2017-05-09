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
/*
  Dado un arreglo A de numeros enteros, cada elemento aparece dos veces excepto uno; encuentre aquel
  que no aparece dos veces.
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Arreglo[] = {1,2,1,2,3,3,4, 5, 4, 5, 6, 8, 6, 8, 9, 9, 9, 10, 11,11, 12, 13, 14};
        int cont = 0;
        System.out.println("El Arreglo:1,2,1,2,3,3,4,5,4,5,6,8,6,8,9,9,9,10,11,11,12,13,14");
        System.out.println("El Numero Que No Se Repite Es:");
        for (int i = 0; i < Arreglo.length; i++) {

            for (int j = 0; j < Arreglo.length; j++) {

                if (Arreglo[i] == Arreglo[j]) {

                    cont++;

                }

            }

            if (cont == 1) {

                System.out.println(Arreglo[i]);

            }

            cont = 0;

        }
    }

}
