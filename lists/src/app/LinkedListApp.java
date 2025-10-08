package app;
import lists.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		/*Criando a lista*/
		l1.add("Ramon");
		l1.add("Ingrid");
		l1.add("Joao");
		l1.add("Eucariontes");
		/*adicionando em um index invalido*/
		try {
			l1.add(5, "Elissandra");
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		/*printando a lista*/
		l1.print();
		System.out.println();
		System.out.println("Tamanho da lista");
		System.out.println(l1.size());
		System.out.println();
		
		/*Removendo joao*/
		l1.remove("Joao");
		/*Removenodo um index invalido */
		try {
			l1.remove(3);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		/*Printando a lista*/
		l1.print();
		System.out.println();
		System.out.println("Tamanho da lista");
		System.out.println(l1.size());
		System.out.println();
		
		/*Mostrando quem esta na posicao 1*/
		System.out.println("Quem está na posicao 1?");
		System.out.println(l1.get(1));
		System.out.println();
		
		/*Mostrando em que posicao está Ramon*/
		System.out.println("Qual a posicao de Ramon?");
		System.out.println(l1.indexOf("Ramon"));
		System.out.println();
		
		/*Colocando Elissandra no lugar de Eucariontes*/
		l1.set(2, "Elissandra");
		l1.print();
		System.out.println();
		
		/*Limpando a lsita*/
		l1.clear();
		l1.print();
		System.out.println();
		System.out.println("Tamanho da lista");
		System.out.println(l1.size());
		
		
		
	}

}
