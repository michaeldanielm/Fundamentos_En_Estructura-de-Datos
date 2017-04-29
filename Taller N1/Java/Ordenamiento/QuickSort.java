
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int all= 50;
      
    int[] lista = new int[all];

    Random rand = new Random();// valores a ramdon
    for(int i = 0 ; i<all; i++ ){
      lista[i] = rand.nextInt(100);
    }
    System.out.println("orden original: " + Arrays.toString(lista));//impresio original
    Quicksort(lista, 0, all - 1); // importando valores oredenados
    System.out.println("ordenado:  " + Arrays.toString(lista));//impresion
    }
    static void Quicksort(int arr[], int p, int r){ // ordenamiento del arreglo

    if(p < r) { 
      int q = Particion(arr, p, r); 
      Quicksort(arr, p, q - 1); 
      Quicksort(arr, q + 1, r); 
    } 
  } 

  static int Particion(int arr[], int p, int r){ 
    int x = arr[r]; 
    int i = p - 1, t; 

    for(int j = p; j < r; j++) { 
      if(arr[j] <= x) { 
        i++; 
        t = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = t; 
      } 
    } 

    t = arr[i + 1]; 
    arr[i + 1] = arr[r]; 
    arr[r] = t; 
    return i + 1; 
  }
}
