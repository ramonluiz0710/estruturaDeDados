package lists;

public class ArrayLists {
	Object element[];
	int size;
	int capacity;
	
	public ArrayLists() {
		this.size = 0;
		this.capacity=5;
		this.element = new Object[this.capacity];
	}
	
	public ArrayLists(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.element = new Object[this.capacity];
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size ==0;
	}
	
	public void print() {
		for(int i =0; i<this.size; i++) {
			System.out.println(this.element[i]);
		}
	}
	
	public boolean add(Object element) {
		if(this.size == this.capacity) {
			aumenta();
		}
		
		this.element[size] = element;
		size++;
		return true;
	}
	
	public void add(Object element, int index) {
		
		Object proxElem = null;
		Object atuElem = null;
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index Invalido!");
		}
		if(this.size == this.capacity) {
			aumenta();
		}
		
		for(int i = 0; i<=this.size; i++) {
			if(i==index) {
				proxElem = this.element[i];
				this.element[i] = element;
			}if(i > index) {
				atuElem = proxElem;
				proxElem = this.element[i];
				this.element[i] = atuElem;
			}
		}
		
		this.size++;
	}
	
	public void clear() {
		this.element = new Object[5];
		this.size = 0;
	}
	
	public Object get(int index) {
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index invalido!");
		}
		
		for(int i=0; i<size; i++) {
			if(i==index) {
				return element[i];
			}
		}
		
		return null;
	}
	
	public int indexOf(Object element) {
		for(int i =0; i<this.size; i++) {
			if(this.element[i].equals(element)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean remove(Object element) {
		boolean removeu = false;
		
		for(int i=0; i<this.size; i++) {
			if(this.element[i].equals(element)) {
				removeu = true;
				size--;
			}
			
			if(removeu) {
				this.element[i] = this.element[i+1];
			}
		}
		
		return removeu;	
	}
	
	public Object remove(int index) {
		Object removido = null;
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index Invalido!");
		}
		
		for(int i = 0; i < this.size; i++) {
			if(index == i) {
				removido = this.element[i];
				this.element[i] = this.element[i+1];
				this.size--;
			}
			if(i > index) {
				this.element[i] = this.element[i+1];
			}
		}
		
		return removido;
	}
	
	public Object set(Object eleemnt, int index) {
		Object substituido =  null;
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index Invalido!");
		}
		
		for(int i = 0; i < this.size; i++) {
			if(index == i) {
				substituido = this.element[i]; 
				this.element[i] = element;
			}
		}
		
		return substituido;
	}
	
	public void trimToSize() {
		Object newElem[] = new Object[this.size];
		
		for(int i = 0; i<this.size; i++) {
			newElem[i] = this.element[i];
		}
		
		this.element = newElem;
	}
	
	private void aumenta() {
		Object newElem[] = new Object[this.capacity*=2];
		
		for(int i = 0; i<this.size; i++) {
			newElem[i] = this.element[i];
		}
		
		this.element = newElem;
	}
}
