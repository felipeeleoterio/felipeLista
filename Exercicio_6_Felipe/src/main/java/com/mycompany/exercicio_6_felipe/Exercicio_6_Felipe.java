/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_6_Felipe {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            x = scanner.nextInt();

            if (x > 0) {
                System.out.println("O número " + x + " é positivo.");
            } else if (x < 0) {
                System.out.println("O número " + x + " é negativo.");
            }

        } while (x != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
