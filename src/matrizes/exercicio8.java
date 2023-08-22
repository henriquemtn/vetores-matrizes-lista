package matrizes;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas (M): ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número X: ");
        int X = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
        	
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Elemento X encontrado na posição [" + i + "][" + j + "]");
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (i < linhas - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("À esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < colunas - 1) {
                        System.out.println("À direita: " + matriz[i][j + 1]);
                    }
                }
            }
        }

        scanner.close();
    }
}
