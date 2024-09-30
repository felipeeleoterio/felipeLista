/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14_felipe;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Exercicio_14_Felipe {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salarioAtual;
        double novoSalario;
        double somaSalariosAtuais = 0;
        double somaSalariosReajustados = 0;

        while (true) {
            // Leitura do nome do funcionário
            System.out.print("Digite o nome do funcionário (ou FIM para encerrar): ");
            nome = scanner.nextLine();

            // Condição de parada
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            // Leitura do salário atual
            System.out.print("Digite o salário atual de " + nome + ": ");
            salarioAtual = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner

            // Cálculo do novo salário com base na faixa salarial
            if (salarioAtual <= 150) {
                novoSalario = salarioAtual * 1.25; // 25% de aumento
            } else if (salarioAtual > 150 && salarioAtual <= 300) {
                novoSalario = salarioAtual * 1.20; // 20% de aumento
            } else if (salarioAtual > 300 && salarioAtual <= 600) {
                novoSalario = salarioAtual * 1.15; // 15% de aumento
            } else {
                novoSalario = salarioAtual * 1.10; // 10% de aumento
            }

            // Exibição dos dados do funcionário
            System.out.printf("Funcionário: %s\n", nome);
            System.out.printf("Salário Atual: R$ %.2f\n", salarioAtual);
            System.out.printf("Salário Reajustado: R$ %.2f\n\n", novoSalario);

            // Acumulando valores
            somaSalariosAtuais += salarioAtual;
            somaSalariosReajustados += novoSalario;
        }

        // Exibição das somas e diferença
        System.out.printf("Soma dos Salários Atuais: R$ %.2f\n", somaSalariosAtuais);
        System.out.printf("Soma dos Salários Reajustados: R$ %.2f\n", somaSalariosReajustados);
        System.out.printf("Diferença: R$ %.2f\n", somaSalariosReajustados - somaSalariosAtuais);

        scanner.close();
    }
}
