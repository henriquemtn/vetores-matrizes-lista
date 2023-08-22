package vetores;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeQuartos = 10;
        Estudante[] quartos = new Estudante[quantidadeQuartos];

        System.out.print("Digite a quantidade de estudantes que vão alugar quartos (1 a 10): ");
        int quantidadeEstudantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeEstudantes; i++) {
            System.out.println("Aluguel #" + (i + 1));
            System.out.print("Nome do estudante: ");
            String nome = scanner.nextLine();
            System.out.print("Email do estudante: ");
            String email = scanner.nextLine();
            System.out.print("Número do quarto escolhido (0 a 9): ");
            int numeroQuarto = scanner.nextInt();
            scanner.nextLine();

            quartos[numeroQuarto] = new Estudante(nome, email);
        }

        System.out.println("\nRelatório de ocupações:");

        for (int i = 0; i < quantidadeQuartos; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + ": " + quartos[i]);
            }
        }

        scanner.close();
    }
}

class Estudante {
    private String nome;
    private String email;

    public Estudante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
