package matrizes;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        System.out.println("Digite os elementos da primeira matriz:");
        preencherMatriz(scanner, matriz1);

        System.out.println("Digite os elementos da segunda matriz:");
        preencherMatriz(scanner, matriz2);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado da soma das matrizes:");
        imprimirMatriz(matrizSoma);

        scanner.close();
    }

    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
