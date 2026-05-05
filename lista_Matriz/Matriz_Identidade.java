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
public class Matriz_Identidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];
        boolean identidade = true;
        
        System.out.println("Digite os valores da sua matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor do elemento [" +i+ "] ["+j+"]");
                matriz[i][j] = sc.nextInt();
                if (i == j && matriz[i][j] != 1 ){
                    identidade = false;
                }else if (i != j && matriz[i][j] != 0){
                    identidade = false;
                }
                    
                
            }
        }
        if (identidade) {
            System.out.println("A matriz é identidade " +identidade);
        }else {
            System.out.println("A matriz é identidade " +identidade);
        }
        
    }
   
}
