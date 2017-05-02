import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelDaniel Murillo López
 * ID:534830
 */
/**
 * Dado un arreglo A de n´umeros enteros, genere un arreglo B de igual tama˜no en donde para cada
posici´on se almacene el producto de todos los elementos de A excepto el que corresponda al mismo
ındice de la posicion.
Ejemplo: Si A = {10, 4, 1, 6, 2}, entonces B = {48, 120, 480, 80, 240}.
 
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main5 M = new Main5();
        int arr[] = {10, 4, 1, 6, 2};
        int n = arr.length;
        System.out.println("El Conjunto De Productos es : ");
        M.productoArray(arr, n);
        
    }
    public void productoArray(int arr[], int n) 
    {
       
        int izquierda[] = new int[n];
        int derecha[] = new int[n];
        int prod[] = new int[n];
 
        int i, j;
 
        izquierda[0] = 1;
 
        
        derecha[n - 1] = 1;

        for (i = 1; i < n; i++)
            izquierda[i] = arr[i - 1] * izquierda[i - 1];
 
        
        for (j = n - 2; j >= 0; j--)
            derecha[j] = arr[j + 1] * derecha[j + 1];
 
      
        for (i = 0; i < n; i++)
            prod[i] = izquierda[i] * derecha[i];
 
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
 
        return;
    }
 
    
}
