package vetores;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos no vetor: ");
        int N = scanner.nextInt();

        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double elemento : vetor) {
            soma += elemento;
        }

        double media = soma / N;

        System.out.printf("Média aritmética: %.3f%n", media);

        System.out.println("Elementos abaixo da média:");

        for (double elemento : vetor) {
            if (elemento < media) {
                System.out.printf("%.1f%n", elemento);
            }
        }

        scanner.close();
    }
}
