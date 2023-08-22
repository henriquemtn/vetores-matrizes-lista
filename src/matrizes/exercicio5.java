package matrizes;

import java.util.Scanner;

public class exercicio5 {
	
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

        double soma = 0;
        int contador = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if ((i + j) % 2 == 0) { 
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média dos valores nas posições pares: " + media);
        } else {
            System.out.println("Não há posições pares na matriz.");
        }

        scanner.close();
    }
}
