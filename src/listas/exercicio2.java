package listas;

import java.util.ArrayList;
import java.util.List;

public class exercicio2 {
	
    public static void main(String[] args) {
    	
        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(8);
        lista.add(23);
        lista.add(19);
        lista.add(27);
        lista.add(5);

        System.out.println("Lista: " + lista);

        double media = calcularMedia(lista);
        System.out.println("Média dos elementos da lista: " + media);
    }

    public static double calcularMedia(List<Integer> lista) {
        int soma = 0;
        for (int elemento : lista) {
            soma += elemento;
        }
        return (double) soma / lista.size();
    }
}
