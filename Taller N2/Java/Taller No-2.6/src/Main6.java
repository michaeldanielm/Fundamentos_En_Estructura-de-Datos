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
 /** Dado un arreglo B de numeros binarios, es decir que solo contiene 0’s y 1’s, encuentre el subarreglo
más grande que tenga exactamente la misma cantidad de 0’s y 1’s.
  */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Main6 sub = new Main6();
        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int tamaño = arr.length;
 
        sub.EncontrarSubArray(arr, tamaño);
    }
    int EncontrarSubArray(int arr[], int n) 
    {
        int suma = 0;
        int maxtamaño = -1, startindex = 0;
        int endindex = 0;
 
      
        for (int i = 0; i < n - 1; i++) 
        {
            suma = (arr[i] == 0) ? -1 : 1;
 
            for (int j = i + 1; j < n; j++) 
            {
                if(arr[j] == 0)  
                    suma += -1; 
                else
                    suma += 1;
 
               
                if (suma == 0 && maxtamaño < j - i + 1) 
                {
                    maxtamaño = j - i + 1;
                    startindex = i;
                }
            }
        }
        endindex = startindex+maxtamaño-1;
        if (maxtamaño == -1)
            System.out.println("No hay sub arreglo");
        else
            System.out.println(startindex+ " a "+endindex);
 
        return maxtamaño;
    }
    
}
