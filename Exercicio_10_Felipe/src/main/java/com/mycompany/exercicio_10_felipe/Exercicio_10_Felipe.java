/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_10_Felipe {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número N
        int N;
        do {
            System.out.print("Digite um número N (entre 0 e 50): ");
            N = scanner.nextInt();
        } while (N < 0 || N > 50);

        double[] A = new double[N];
        double[] NEG = new double[N]; // Vetor para negativos
        double[] POS = new double[N]; // Vetor para positivos e zero
        int negCount = 0, posCount = 0;

        // Leitura dos N números reais
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextDouble();

            // Separação em NEG e POS
            if (A[i] < 0) {
                NEG[negCount] = A[i];
                negCount++;
            } else {
                POS[posCount] = A[i];
                posCount++;
            }
        }

        // Exibição dos vetores NEG e POS
        System.out.println("\nValores Negativos (NEG):");
        for (int i = 0; i < negCount; i++) {
            System.out.println(NEG[i]);
        }
        System.out.println("Quantidade de valores negativos: " + negCount);

        System.out.println("\nValores Positivos e Zero (POS):");
        for (int i = 0; i < posCount; i++) {
            System.out.println(POS[i]);
        }
        System.out.println("Quantidade de valores positivos e zero: " + posCount);

        scanner.close();
    }
}

