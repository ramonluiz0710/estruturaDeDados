package pilha;

import java.util.EmptyStackException;

public class Stack {
	/*Atributo para o topo da pilha*/
	private StackNode topOfStack;
	
	/*classe para o nó da pilha*/
	private class StackNode {
		private Object element;
		private StackNode next;
		
		private StackNode(Object element, StackNode next) {
			this.element = element;
			this.next = next;
		}
	}
	/*Construtor da classe*/
	public Stack() {
		this.topOfStack = null;
	}
	/*Testa se a pilha está vazia*/
	public boolean isEmpty() {
		return this.topOfStack == null;	
	}
	
	/*adiciona um elemento no topo da pilha*/
	public void push(Object element) {
		this.topOfStack = new StackNode(element, topOfStack);
	}
	
	/*Remove o elemento do topo da pilha*/
	public void pop() {
		if(this.topOfStack == null) {
			throw new EmptyStackException();
		}
		
		this.topOfStack = this.topOfStack.next;
	}
	
	/*Retorna o elemento do topo da pilha*/
	public Object peek() {
		if(this.topOfStack == null) {
			throw new EmptyStackException();
		}
		
		return this.topOfStack.element;
	}
	
	/*Imprime todos os elementos da pilha*/
	public void print() {
		StackNode node = this.topOfStack;
		
		if(this.isEmpty()) {
			System.out.println("Pilha vazia!");
			return;
		}
		
		System.out.println("<--inicio-->");
		while(node != null) {
			System.out.println(node.element);
			node = node.next;
		}
		System.out.println("<--fim-->");
	}
}
