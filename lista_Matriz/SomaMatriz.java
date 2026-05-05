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
public class SomaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];
        int contador = 0;
        System.out.println("Digite os valores de sua matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor do elemento [" +i+ "] ["+j+"]");
                matriz [i][j] = sc.nextInt();
                contador += matriz[i][j];
                System.out.print("Essa é a sua matriz :" +matriz[i][j]);
            }
            
        }
        System.out.println();      
        System.out.println("E essa é a soma dela : " +contador);
    }
}
