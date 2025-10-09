package pilhaApp;

import java.util.EmptyStackException;

import pilha.Stack;

public class AppPilha {

	public static void main(String[] args) {
		Stack pilha = new Stack();
		
		pilha.push("Ramon");
		pilha.push("Elissandra");
		pilha.push("Ingrid");
		
		pilha.print();
		System.out.println();
		
		pilha.print();
		System.out.println();
		
		try {
			System.out.println(pilha.peek());
		}catch(EmptyStackException e) {
			System.out.println("Pilha vazia!");
		}
		

	}

}
