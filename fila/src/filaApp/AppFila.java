package filaApp;

import fila.Queue;

public class AppFila {

	public static void main(String[] args) {
		Queue fila = new Queue();
		
		fila.enqueue("Ramon");
		fila.enqueue("Joao");
		fila.enqueue("Ingrid");
		
		fila.print();
		System.out.println();
		
		fila.dequeue();
		fila.dequeue();
		fila.enqueue("Iraci");
		
		fila.print();

	}

}
