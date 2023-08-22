package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
	
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Livro livro = (Livro) obj;
        return titulo.equalsIgnoreCase(livro.titulo);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}

public class exercicio7 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        List<Livro> livros = new ArrayList<>();

        while (true) {
        	
            System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Buscar livro por título");
            System.out.println("3. Exibir lista de livros");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
            
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    livros.add(new Livro(titulo, autor));
                    System.out.println("Livro adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o título do livro a buscar: ");
                    String tituloBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                            System.out.println("Livro encontrado: " + livro);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Lista de Livros ---");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(i + ". " + livros.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
