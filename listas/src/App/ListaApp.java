package App;

import entities.Aluno;
import listas.ListacomArrays;

public class ListaApp {

	public static void main(String[] args) {
		
		ListacomArrays lista = new ListacomArrays();
		
		if(lista.isEmpty()) {
			System.out.println("Lista vazia!");
		}else {
			System.out.println("Lista nao vazia!");
		}
		
		Aluno a1 = new Aluno("Ramon", "123");
		Aluno a2 = new Aluno("Matheus", "1234");
		Aluno a3 = new Aluno("Araujo", "94685");
		Aluno a4 = new Aluno("Joao", "1245");
		Aluno a5 = new Aluno("Jose", "64537");
		Aluno a6 = new Aluno("Juan", "9841");
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.print();
		
		System.out.println();
		
		lista.add(2, a5);
		lista.print();
		
		System.out.println();
		
		lista.add(1, a6);
		lista.print();
		
		System.out.println();
		
		System.out.println(lista.get(3));
		
		System.out.println();
		
		System.out.println(lista.indexOf(a3));
		
		System.out.println();
		
		lista.remove(a2);
		lista.print();
		
		System.out.println();
		
		lista.remove(0);
		lista.print();
		
		System.out.println();
		
		lista.set(0, a1);
		lista.print();
		
		System.out.println();
		
		lista.trimToSize();
		lista.add(a6);
		lista.print();
		
		System.out.println();
		
		lista.clear();
		
		lista.print();
	}

}
