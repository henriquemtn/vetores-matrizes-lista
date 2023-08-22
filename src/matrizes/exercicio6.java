package matrizes;

import java.util.Scanner;

public class exercicio6 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonalPrincipal = 0;

        for (int i = 0; i < linhas; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.println("Soma dos valores da diagonal principal: " + somaDiagonalPrincipal);

        scanner.close();
    }
}
