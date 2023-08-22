package matrizes;

import java.util.Scanner;

public class exercicio7 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int linhas = 4;
        int colunas = 4;
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Maior valor da matriz: " + maiorValor);
        System.out.println("Posição do maior valor: [" + linhaMaior + "][" + colunaMaior + "]");

        scanner.close();
    }
}
