/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novoprojeto;
import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class novoprojeto2 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
         
        int[] numeros = new int[5];
        
        for(int i = 0; i <5; i++){
            System.out.println("Informe o valor para a posição [" + i + "]:");
            numeros [i] = scanner.nextInt();
        }
        
        System.out.println("----- VALORES INFORMADOS ------");
        for (int i = 0; i < 5; i++){
            System.out.println("Valor na posição [" + i + "]:"+ numeros [i]);
        }
    }
    
}
