package fila;

public class Queue {
	
	/*Atributos do comeco e do final da fila*/
	private QueueNode frontQueue;
	private QueueNode backQueue;
	
	/*Inner class para o nó da fila*/
	private class QueueNode{
		private Object element;
		private QueueNode next;
		
		private QueueNode(Object element, QueueNode next) {
			this.element = element;
			this.next = next;
		}
	}
	
	/*Construtor da fila*/
	public Queue() {
		this.frontQueue = this.backQueue= null;
	}
	
	/*Testa se a fila está vazia*/
	public boolean isEmpty() {
		return this.frontQueue == null;
	}
	
	/*Adiciona um elemento ao final da fila*/
	public void enqueue(Object element) {
		
		QueueNode node = new QueueNode(element, null);
		
		if(isEmpty()) {
			this.frontQueue = this.backQueue = node;
		}else {
			this.backQueue.next = node;
			this.backQueue = node;
		}
	}
	
	/*Retira o elemento do começo da fila*/
	public Object dequeue() {
		QueueNode node = this.frontQueue;
		
		if(this.isEmpty()) {
			return null;
		}
		
		this.frontQueue = this.frontQueue.next;
		return node;
	}
	
	
	/*Imprime a fila*/
	public void print() {
		QueueNode node = this.frontQueue;
		if(isEmpty()) {
			System.out.println("Lista Vazia!");
		}else {
			System.out.println("<--inicio-->");
			while(node != null) {
				System.out.println(node.element);
				node = node.next;
			}
			System.out.println("<--fim-->");
		}
	}

}
