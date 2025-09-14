package App;

import listas.ListaEncadeada;

public class ListaEncadeadaApp {

	public static void main(String[] args) {
		
		ListaEncadeada minhaLista = new ListaEncadeada();
		
		minhaLista.add("Ramon");
		minhaLista.add("Matheus");
		minhaLista.add("Carlos");
		minhaLista.add("Jose");
		minhaLista.add("Jorge");
		minhaLista.add("Marcos");
		minhaLista.add("joana");
		
		
		if(minhaLista.isEmpty()) {
			System.out.println("Esta vazia!");
		}else {
			System.out.println("Nao esta vazia!");
		}
		
		System.out.println(minhaLista.size());
		
		minhaLista.print();
		
		System.out.println(minhaLista.get(3));
	
	}
	
}
