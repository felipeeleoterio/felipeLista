/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_9_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_9_Felipe {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValores = 100; // Tamanho máximo do vetor
        double[] pesos = new double[maxValores]; // Vetor para armazenar os pesos
        int contador = 0; // Contador de valores válidos
        double peso;

        // Loop para ler pesos até que o usuário digite 0
        do {
            System.out.print("Digite o peso do lutador (ou 0 para sair): ");
            peso = scanner.nextDouble();

            if (peso > 0) {
                if (peso < 65 || peso >= 100) {
                    System.out.println("Peso fora do intervalo permitido.");
                } else {
                    // Armazenar peso no vetor
                    pesos[contador] = peso;
                    contador++;
                }
            }

        } while (peso != 0 && contador < maxValores);

        // Exibir os pesos válidos, total e quantidade
        System.out.println("\nPesos fornecidos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Peso " + (i + 1) + ": " + pesos[i] + " kg");
        }

        System.out.println("Total de pesos válidos: " + contador);

        // Cálculo do total de pesos
        double somaPesos = 0;
        for (int i = 0; i < contador; i++) {
            somaPesos += pesos[i];
        }
        System.out.println("Soma total dos pesos: " + somaPesos + " kg");

        // Exibir a categoria de cada peso
        for (int i = 0; i < contador; i++) {
            String categoria = "";
            if (pesos[i] < 65) {
                categoria = "Pena";
            } else if (pesos[i] < 72) {
                categoria = "Leve";
            } else if (pesos[i] < 79) {
                categoria = "Ligeiro";
            } else if (pesos[i] < 86) {
                categoria = "Meio médio";
            } else if (pesos[i] < 93) {
                categoria = "Médio";
            } else if (pesos[i] < 100) {
                categoria = "Meio pesado";
            } else {
                categoria = "Pesado";
            }
            System.out.println("O lutador com peso " + pesos[i] + " kg se enquadra na categoria: " + categoria);
        }

        scanner.close();
    }
}
