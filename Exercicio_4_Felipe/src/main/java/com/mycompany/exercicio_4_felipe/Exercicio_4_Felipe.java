/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_4_Felipe {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verificando se os lados podem formar um triângulo
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os lados formam um triângulo.");

            // Verificando o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        scanner.close();
    }
}
