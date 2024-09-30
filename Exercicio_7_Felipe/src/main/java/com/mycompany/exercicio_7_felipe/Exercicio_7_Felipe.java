/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_7_felipe;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Exercicio_7_Felipe {

   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int quantidade = 0;
        int soma = 0;

        System.out.println("Digite valores inteiros positivos (0 ou negativo para sair):");
        
        while (true) {
            valor = scanner.nextInt();

            if (valor <= 0) {
                break; // Sai do loop se o valor for zero ou negativo
            }

            // Atualiza o maior e menor valores
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }

            // Atualiza a quantidade e a soma
            quantidade++;
            soma += valor;
        }

        // Verifica se ao menos um valor foi informado
        if (quantidade > 0) {
            double media = (double) soma / quantidade;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Quantidade de valores: " + quantidade);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}
