package vetores;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        String[] nomes = new String[quantidadePessoas];
        int[] idades = new int[quantidadePessoas];
        double[] alturas = new double[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            scanner.nextLine(); 
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        double alturaMedia = 0;
        int countMenores16 = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            alturaMedia += alturas[i];
            if (idades[i] < 16) {
                countMenores16++;
                System.out.println("Nome da pessoa com menos de 16 anos: " + nomes[i]);
            }
        }

        alturaMedia /= quantidadePessoas;
        double percentualMenores16 = (countMenores16 / (double) quantidadePessoas) * 100;

        System.out.println("Altura média das pessoas: " + alturaMedia);
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + percentualMenores16 + "%");

        scanner.close();
    }
}
