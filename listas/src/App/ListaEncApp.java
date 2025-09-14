package App;

import listas.ListaEncadeada;

public class ListaEncApp {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		
		System.out.println(lista.size());
		System.out.println();
		
		System.out.println(lista.isEmpty());
		System.out.println();
		
		
		lista.add("ramon");
		lista.add("Luiz");
		lista.add("Lucas");
		
		lista.print();
		System.out.println();
		
		/*System.out.println(lista.get(3));
		System.out.println();*/
		
		System.out.println(lista.get(2));
		System.out.println();
		
		System.out.println(lista.indexOf("Luiz"));
		System.out.println();
		
		lista.remove("ramon");
		lista.print();
		System.out.println();
		

	}

}
