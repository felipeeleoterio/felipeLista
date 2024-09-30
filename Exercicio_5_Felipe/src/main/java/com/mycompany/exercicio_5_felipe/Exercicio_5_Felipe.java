/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5_felipe;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_5_Felipe {

  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome e peso do lutador
        System.out.print("Digite o nome do lutador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso do lutador (em kg): ");
        double peso = scanner.nextDouble();

        // Determinação da categoria
        String categoria;
        if (peso < 60) {
            categoria = "Pena";
        } else if (peso >= 60 && peso < 70) {
            categoria = "Ligeiro";
        } else if (peso >= 70 && peso < 80) {
            categoria = "Médio";
        } else if (peso >= 80 && peso < 90) {
            categoria = "Cruiserweight";
        } else {
            categoria = "Pesado";
        }

        // Montagem da mensagem
        String mensagem = "O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria + ".";

        // Exibição das informações
        System.out.println(mensagem);

        // Salvando a mensagem em um arquivo TXT
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("lutador.txt"))) {
            writer.write("Nome fornecido: " + nome);
            writer.newLine();
            writer.write("Peso fornecido: " + peso);
            writer.newLine();
            writer.write(mensagem);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
        }

        scanner.close();
    }
}

