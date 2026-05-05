/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Exercicios_Matriz;

import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class Matriz_Transposta {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][]matriz1 = new int [3][3];
        int [][]matriz2 = new int [3][3];
        
        System.out.println("Digite os valores de sua matriz");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor do elemento [" +i+ "] ["+j+"]");
                matriz1 [i][j] = sc.nextInt();
                
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        // Exibindo matriz1
        System.out.println("\nMatriz 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo matriz2 (transposta)
        System.out.println("\nMatriz 2 (transposta):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
