package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Funcionario {
	
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(double percentual) {
        salario += salario * (percentual / 100);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + salario;
    }
}

public class exercicio5 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int n = scanner.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o ID do funcionário: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Digite o ID do funcionário para aumento: ");
        int idAumento = scanner.nextInt();
        System.out.print("Digite o percentual de aumento: ");
        double percentualAumento = scanner.nextDouble();

        boolean funcionarioEncontrado = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == idAumento) {
                funcionario.aplicarAumento(percentualAumento);
                funcionarioEncontrado = true;
                break;
            }
        }

        if (!funcionarioEncontrado) {
            System.out.println("Funcionário não encontrado.");
        }

        System.out.println("Listagem atualizada dos funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
