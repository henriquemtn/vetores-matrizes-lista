package vetores;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 10;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
       
        System.out.println("A soma de todos os elementos é: " + soma);
        
        scanner.close();
    }
}
