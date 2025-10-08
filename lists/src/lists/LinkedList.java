package lists;

public class LinkedList {

	/*Atributos da estrutura*/
	private ListNode head;
	private ListNode tail;
	private int size;
	
	/*Inner Class para criar o no da lista*/
	private class ListNode{
		public Object element;
		public ListNode next;
		
		public ListNode(Object element) {
			this.element = element;
			this.next = null;
		}
	}
	
	/*Construtor da Estrutura*/
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	/*retorna o tamanho atual da lista*/
	public int size() {
		return this.size;
	}
	
	/*Retorna se a lista esta vazia ou não*/
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	/*Mostra os objetos da lista*/
	public void print() {
		ListNode node = this.head;
		
		if(isEmpty()) {
			System.out.println("Lista Vazia!");
		}else {
			System.out.println("<--Inicio-->");
			while(node != null) {
				System.out.println(node.element);
				node = node.next;
			}
			System.out.println("<--Fim-->");
		}
	}
	
	/*adciona um objeto no final da lista*/
	public boolean add(Object element) {
		ListNode newNode = new ListNode(element);
		
		if(isEmpty()) {
			this.head = this.tail = newNode;
			this.head.next = this.tail;
		}else {
			this.tail.next = newNode;
			tail = newNode;
		}
		
		this.size++;
		return true;
	}
	
	/*adiciona um objeto em determinada posição da lista*/
	public void add(int index, Object element) {
		
		if(index < 0 || index > this.size) {
			  throw new IndexOutOfBoundsException("Index Invalido!!");
		  }
		
		ListNode newNode = new ListNode(element);
		ListNode node = this.head;
		
	    if(index ==  0) {
		  newNode.next = this.head;
		  this.head = newNode;
	    }else if(index == this.size()) {
		  this.tail.next = newNode;
		  this.tail = newNode;
	    }else {
		  for(int i = 0; i<this.size; i++) {
			  if(index == i) {
				  findPrevious(node.element).next = newNode;
				  newNode.next = node;
			  }
			  node = node.next;
		  }
	  }
	  
	  this.size++;
	}
	
	/*remove a primeira ocorrencia de um objeto especifico da lista*/
	public boolean remove(Object element) {
		ListNode node = this.head;
		
		if(this.head.element.equals(element)) {
			this.head = this.head.next;
			this.size--;
			return true;
		}else if(this.tail.element.equals(element)){
			node = findPrevious(this.tail.element);
			node.next = null;
			this.tail = node;
			this.size--;
			return true;
		}else {
			while(node != null) {
				if(element.equals(node.element)) {
					findPrevious(node.element).next = node.next;
					this.size--;
					return true;
				}
				node = node.next;
			}
		}
		
		return false;
	}
	
	/*Remove o objeto de uma determinada posição da lista*/
	public Object remove(int index) {
		
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index Invalido!");
		}
		
		Object element = null;
		ListNode node = this.head;
		
		if(index == 0) {
			element = this.head;
			this.head = this.head.next;
		}else if(index == (size-1)) {
			element = this.tail.element;
			findPrevious(this.tail.element).next = null;
		}else {
			for(int i = 0; i < size; i++) {
				if(i == index) {
					findPrevious(node.element).next = node.next;
					element = node.element;
				}
				
				node = node.next;
			}
		}
		
		this.size--;
		return element;
		
	}
	
	/*Limpa a lista*/
	public void clear() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	/*Retorna o objeto de uma determinada posição*/
	public Object get(int index) {
		
		if(index < 0 || index > this.size()) {
			throw new IndexOutOfBoundsException("Index invaido!");
		}
		
		ListNode node = this.head;
		
		for(int i = 0; i < this.size; i++) {
			if(index == i) {
				return node.element;
			}
			
			node = node.next;
		}
		
		return null;
	}
	
	/*Retorna a posição de um determinado objeto*/
	public int indexOf(Object element) {
		ListNode node = this.head;
		
		for(int i = 0; i < this.size; i++) {
			if(node.element.equals(element)) {
				return i;
			}
			node = node.next;
		}
		
		return -1;
	}
	
	/*Substitui o elemento de uma determinada posição por outro elemento*/
	public Object set(int index, Object element) {
		
		if(index < 0 || index > this.size()) {
			throw new IndexOutOfBoundsException("Index invaido!");
		}
		
		ListNode node = this.head;
		Object returnElement = null;
		
		for(int i = 0; i < this.size; i++) {
			if(i == index) {
				returnElement = node.element;
				node.element = element;
			}
			
			node = node.next;
		}
		
		return returnElement;
	}
	
	
	/*Retprna o nó anterior ao nó do elemento de parametro*/
	private ListNode findPrevious(Object element){
		ListNode node = this.head;
		
		for(int i = 0; i<this.size; i++) {
			if(node.next.element == element) {
				return node;
			}
			
			node = node.next;
			
		}
		return null;
	}
	
	
}
