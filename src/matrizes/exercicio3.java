package matrizes;

import java.util.Scanner;

public class exercicio3 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[][] matrizTransposta = new int[colunas][linhas];

        System.out.println("Digite os elementos da matriz:");
        preencherMatriz(scanner, matriz);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("Matriz transposta:");
        imprimirMatriz(matrizTransposta);

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

