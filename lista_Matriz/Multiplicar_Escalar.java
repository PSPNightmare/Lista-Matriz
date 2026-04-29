/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_Matriz;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Multiplicar_Escalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];        
        int [][] matriz2 = new int [3][3];
        
        System.out.println("Digite qual número escalar deseja multiplicar a matriz: ");
        int escalar = sc.nextInt();
        
        System.out.println("Digite os valores de sua matriz: ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o valor da posição[" + i + "][" + j + "]");
                matriz [i][j] = sc.nextInt();
                
                matriz2 [i][j]= matriz[i][j] * escalar;
                
                
                
            }
            
        }
        System.out.println("Matriz X "+escalar+ " = ");
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.println(matriz2[i][j]+ " ");
            }
        }
        System.out.println();
    }
}
