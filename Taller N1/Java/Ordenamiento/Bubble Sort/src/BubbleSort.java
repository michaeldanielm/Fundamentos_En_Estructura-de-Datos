
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López
 * Id: 534830
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int all= 50;
		
		int[] array = new int[all];
		Random rand = new Random();//valores a ramdonn
  		for(int i = 0 ; i<all; i++ ){
			array[i] = rand.nextInt(100);//ingreso datos  a lazar con un rango de 50 numeros
		}
		    
		String output = "orden original\n";//impresion 
		    

		for(int i=0; i<array.length; i++ )
			output += " " + array[ i ];
		     
		bubbleSort( array );  // sort array
		    
		output += "\n\nordenado\n"; //impresion
		    
		for (int j=0; j<array.length; j++ ) //Contador y arreglo
			output += " " + array[ j ];
		    
		System.out.println( output );
    }
    public static void bubbleSort( int array2[] )  //algoritmo  de ordenamiento                  
	{                                                         
                    
		for(int pasar = 1; pasar < array2.length; pasar++ ) {   
          
			for ( int elemento = 0; elemento < array2.length - 1; elemento++ ) {

				if ( array2[ elemento ] > array2[ elemento + 1 ] ) 
					intercambiar( array2, elemento, elemento + 1 );         
			}               
		}                       
	}                            

                     
	public static void intercambiar( int array3[], int primero, int segundo )// intercambio de valores
	{                                                      
		int tener;       
		
		tener = array3[ primero ];                             
		array3[ primero ] = array3[ segundo ];                 
		array3[ segundo ] = tener ;                            
	}    
    
    
}
