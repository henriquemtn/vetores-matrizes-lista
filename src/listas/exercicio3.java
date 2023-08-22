package listas;

import java.util.ArrayList;
import java.util.List;

public class exercicio3 {
	
    public static void main(String[] args) {
    	
        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(8);
        lista.add(23);
        lista.add(19);
        lista.add(27);
        lista.add(5);

        System.out.println("Lista: " + lista);

        int elementoProcurado1 = 19;
        int elementoProcurado2 = 25;

        if (verificarElemento(lista, elementoProcurado1)) {
            System.out.println("O elemento " + elementoProcurado1 + " existe na lista.");
        } else {
            System.out.println("O elemento " + elementoProcurado1 + " não existe na lista.");
        }

        if (verificarElemento(lista, elementoProcurado2)) {
            System.out.println("O elemento " + elementoProcurado2 + " existe na lista.");
        } else {
            System.out.println("O elemento " + elementoProcurado2 + " não existe na lista.");
        }
    }

    public static boolean verificarElemento(List<Integer> lista, int elemento) {
        return lista.contains(elemento);
    }
}
