/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael  Daniel Murillo López
 * iD:534830
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
- Dada una matriz cuadrada M de tamaño m*m, la cual 
almacena numeros enteros generados de forma aleatoria, 
siendo m un parametro, realice un programa que determine 
la cantidad de numeros pares, impares positivos y 
negativos, y ademas imprima la lista de cada uno de 
los subconjuntos

 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> ParPos = new ArrayList<Integer>();
        ArrayList<Integer> ParNeg = new ArrayList<Integer>();
        ArrayList<Integer> ImpPos = new ArrayList<Integer>();
        ArrayList<Integer> ImpNeg = new ArrayList<Integer>();
        System.out.println("Digite las dimensiones de la matriz m*m");
        int m = leer.nextInt();
        int n;
        int Matriz[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                Matriz[i][j] = (int) (r.nextFloat() * 100);
                n = (int) (r.nextFloat() * 2);
                if (n == 0) {
                    Matriz[i][j] *= -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(Matriz[i][j]<0){
                    if(Math.abs(Matriz[i][j])%2==0){
                        ParNeg.add(Matriz[i][j]);
                    } else {
                        ImpNeg.add(Matriz[i][j]);
                    }
                } else {
                    if(Matriz[i][j]%2==0){
                        ParPos.add(Matriz[i][j]);
                    } else {
                        ImpPos.add(Matriz[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + Matriz[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("        Pares\n"
                         + "Postivos:");
        for (int i = 0; i < ParPos.size(); i++) {
            System.out.print("|"+ParPos.get(i)+"|");
        }
        System.out.println("\nNegativos:");
        for (int i = 0; i < ParNeg.size(); i++) {
            System.out.print("|"+ParNeg.get(i)+"|");
        }
        System.out.println("\n       Impares\n"
                         + "Postivos:");
        for (int i = 0; i < ImpPos.size(); i++) {
            System.out.print("|"+ImpPos.get(i)+"|");
        }
        System.out.println("\nNegativos:");
        for (int i = 0; i < ImpNeg.size(); i++) {
            System.out.print("|"+ImpNeg.get(i)+"|");
        }
    }

}
