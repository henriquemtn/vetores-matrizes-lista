package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        concluida = true;
    }

    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : "");
    }
}

public class exercicio6 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        List<Tarefa> tarefas = new ArrayList<>();
        List<Tarefa> tarefasConcluidas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Lista de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Exibir tarefas concluídas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
            
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(new Tarefa(descricao));
                    System.out.println("Tarefa adicionada.");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a marcar como concluída: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        Tarefa tarefa = tarefas.get(indice);
                        tarefa.marcarConcluida();
                        tarefasConcluidas.add(tarefa);
                        tarefas.remove(indice);
                        System.out.println("Tarefa marcada como concluída.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Tarefas Pendentes ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("\n--- Tarefas Concluídas ---");
                    for (int i = 0; i < tarefasConcluidas.size(); i++) {
                        System.out.println(i + ". " + tarefasConcluidas.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
