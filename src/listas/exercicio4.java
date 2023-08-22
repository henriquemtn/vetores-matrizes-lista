package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close();
    }
}
