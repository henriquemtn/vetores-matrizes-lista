package listas;

import java.util.Random;
import java.util.Scanner;

public class exercicio8 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(200) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 200.");

        while (true) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite é muito baixo. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
                break;
            }
        }

        scanner.close();
    }
}
