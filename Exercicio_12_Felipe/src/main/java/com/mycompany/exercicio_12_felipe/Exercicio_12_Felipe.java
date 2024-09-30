/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12_felipe;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_12_Felipe {

   


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
        System.out.print("Digite um número X para pesquisar e eliminar no vetor: ");
        int X = scanner.nextInt();

        // Criando um novo vetor para armazenar os elementos restantes
        int[] temp = new int[N];
        int count = 0; // Contador de elementos que não são X

        for (int i = 0; i < N; i++) {
            if (V[i] != X) {
                temp[count] = V[i];
                count++;
            }
        }

        // Criando um novo vetor com o tamanho correto
        int[] novoV = new int[count];
        for (int i = 0; i < count; i++) {
            novoV[i] = temp[i];
        }

        // Exibindo o vetor atualizado
        System.out.print("Vetor atualizado: ");
        if (count == 0) {
            System.out.println("Todos os elementos foram removidos.");
        } else {
            for (int num : novoV) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
