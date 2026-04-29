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
public class SomadasDiagonaisMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int contPri = 0;
        int contSec = 0;

        System.out.println("Digite os valores da sua matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da posição[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
                
                if (i + j == 2) {
                   contSec += matriz[i][j] ;
                }
                
                if (i == j) {
                    contPri += matriz[i][j];
                }

            }
        }
        
        System.out.println("A soma da matriz primaria é " +contPri);
        System.out.println("A soma da matriz secundaria é "+contSec);
        
    }

}
