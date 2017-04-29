
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López
 * ID: 534830
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int all= 50;
    		
    	int[] lista = new int[all];
    	Random rand = new Random();// valores al lasar 
      	for(int i = 0 ; i<all; i++ ){
    		lista[i] = rand.nextInt(50);
    	}

        System.out.println("orden original: " + Arrays.toString(lista));// impresion  del vector desordenad
        mergeSort(lista);// impórtando la lisat ordenada
        System.out.println("ordenado:  " + Arrays.toString(lista));// impresion del vector ordenada
    }
    public static void mergeSort(int[] array) {
        if (array.length > 1) {

            int[] izquierda = Mitadizquierda(array);
            int[] derecha = Mitadderecha(array);
            

            mergeSort(izquierda);
            mergeSort(derecha);
            

            merge(array,izquierda, derecha);
        }
    }
    

    public static int[] Mitadizquierda(int[] array) {
        int tamaño1 = array.length / 2;
        int[] izquierda = new int[tamaño1];
        for (int i = 0; i < tamaño1; i++) {
            izquierda[i] = array[i];
        }
        return izquierda;
    }
    

    public static int[] Mitadderecha(int[] array) {
        int tamaño1 = array.length / 2;
        int tamaño2 = array.length - tamaño1;
        int[] right = new int[tamaño2];
        for (int i = 0; i < tamaño2; i++) {
            right[i] = array[i + tamaño1];
        }
        return right;
    }
    

    public static void merge(int[] result, int[] izquierda, int[] derecha) {
        int i1 = 0;   
        int i2 = 0;  
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= derecha.length || (i1 < izquierda.length && 
                    izquierda[i1] <= derecha[i2])) {
                result[i] = izquierda[i1];   
                i1++;
            } else {
                result[i] = derecha[i2];  
                i2++;
            }
        }
    }
    
}
