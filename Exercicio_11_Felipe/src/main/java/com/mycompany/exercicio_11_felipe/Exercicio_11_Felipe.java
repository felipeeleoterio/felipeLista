/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11_felipe;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_11_Felipe {

  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Leitura do número N
        int N;
        do {
            System.out.print("Digite um número N (entre 0 e 50): ");
            N = scanner.nextInt();
        } while (N < 0 || N > 50);

        // Definindo e preenchendo o vetor V com números inteiros aleatórios
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }

        // Exibição do vetor V
        System.out.print("Vetor V: ");
        for (int num : V) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Laço para leitura do número X
        System.out.print("Digite um número X para pesquisar no vetor: ");
        int X = scanner.nextInt();

        boolean found = false;
        System.out.print("O número " + X + " está nas posições: ");
        for (int i = 0; i < N; i++) {
            if (V[i] == X) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("O número " + X + " não está presente no vetor.");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}

