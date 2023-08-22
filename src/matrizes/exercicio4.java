package matrizes;

import java.util.Random;

public class exercicio4 {
	
    public static void main(String[] args) {
    	
        int linhas = 4;
        int colunas = 4;

        int[][] matrizOriginal = new int[linhas][colunas];
        preencherMatrizAleatoria(matrizOriginal);

        System.out.println("Matriz original:");
        exibirMatriz(matrizOriginal);

        int[][] matrizTransposta = transporMatriz(matrizOriginal);

        System.out.println("Matriz transposta:");
        exibirMatriz(matrizTransposta);
    }

    public static void preencherMatrizAleatoria(int[][] matriz) {
    	
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
    	
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transporMatriz(int[][] matriz) {
    	
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
    }
}
