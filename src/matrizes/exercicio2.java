package matrizes;

import java.util.Scanner;

public class exercicio2 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasMatriz1 = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasMatriz1 = scanner.nextInt();

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasMatriz2 = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasMatriz2 = scanner.nextInt();

        if (colunasMatriz1 != linhasMatriz2) {
            System.out.println("As matrizes não podem ser multiplicadas devido às dimensões.");
            scanner.close();
            return;
        }

        int[][] matriz1 = new int[linhasMatriz1][colunasMatriz1];
        int[][] matriz2 = new int[linhasMatriz2][colunasMatriz2];
        int[][] matrizResultado = new int[linhasMatriz1][colunasMatriz2];

        System.out.println("Digite os elementos da primeira matriz:");
        preencherMatriz(scanner, matriz1);

        System.out.println("Digite os elementos da segunda matriz:");
        preencherMatriz(scanner, matriz2);

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado da multiplicação das matrizes:");
        imprimirMatriz(matrizResultado);

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
