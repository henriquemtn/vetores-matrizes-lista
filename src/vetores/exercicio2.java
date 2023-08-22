package vetores;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 10;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        boolean emOrdemCrescente = true;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] < vetor[i - 1]) {
                emOrdemCrescente = false;
                break;
            }
        }
        
        if (emOrdemCrescente) {
            System.out.println("O vetor está em ordem crescente.");
        } else {
            System.out.println("O vetor não está em ordem crescente.");
        }
        
        scanner.close();
    }
}

