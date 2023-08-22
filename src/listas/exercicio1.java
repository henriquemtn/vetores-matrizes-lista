package listas;

import java.util.ArrayList;
import java.util.List;

public class exercicio1 {
	
    public static void main(String[] args) {
    	
        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(8);
        lista.add(23);
        lista.add(19);
        lista.add(27);
        lista.add(5);

        System.out.println("Lista original: " + lista);

        int maiorElemento = encontrarMaiorElemento(lista);
        System.out.println("Maior elemento da lista: " + maiorElemento);

        lista.remove(Integer.valueOf(maiorElemento));

        System.out.println("Lista após remover o maior elemento: " + lista);
    }

    public static int encontrarMaiorElemento(List<Integer> lista) {
        int maior = lista.get(0);
        for (int elemento : lista) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }
}
