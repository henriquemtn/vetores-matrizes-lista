package vetores;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int quantidadeNumeros = scanner.nextInt();

        int[] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números pares:");

        int quantidadePares = 0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);

        scanner.close();
    }
}
