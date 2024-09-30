/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_2_Felipe {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > 0 && numero2 > 0) {
            int soma = numero1 + numero2;
            System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
        } else {
            System.out.println("Dados de Entrada são Inválidos");
        }

        scanner.close();
    }
}
