package listas;

public class ListacomArrays {
	
	private Object[] elements;
	private int capacity;
	private int size;
	
	public ListacomArrays() {
		this.capacity = 5;
		this.elements = new Object[this.capacity];
		this.size = 0;
	}
	
	public ListacomArrays(int capacity) {
		this.capacity = capacity;
		this.elements = new Object[this.capacity];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return(size == 0);
	}
	
	public void print() {
		
		if(size == 0) {
			System.out.println("Lista vazia!");
		}else {
			for(Object t : this.elements) {
				if(t == null) {
					break;
				}
			System.out.println(t.toString());
			}
		}
	}
	
	public boolean add(Object element) {
				if(size == capacity) {
					aumentarCapacidade();
				}
				
				this.elements[size] = element;
				size ++;
				return true;
	}
	
	public boolean add(int index, Object element) {
		Object o = new Object();
		Object u = new Object();
		
		if(size == capacity) {
			aumentarCapacidade();
		}
		
		for(int i = index; i<= this.size; i++) {
			
			if(i==index) {
				o = this.elements[i];
				this.elements[i] = element;
			}else if(i>index) {
				u = this.elements[i];
				this.elements[i] = o;
				o = u;
			}
		}
		size ++;
		return true;
	}
	
	public boolean clear() {
		
		this.elements = new Object[5];
		this.size = 0;
		this.capacity = 5;
		return true;
	}
	
	public Object get(int index) {
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		return this.elements[index];
	}
	
	public int indexOf(Object obj) {
		for(int i = 0; i<this.capacity; i++) {
			if(this.elements[i].equals(obj)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public boolean remove(Object obj) {
		
		int index = 0;
		boolean removeu = false;
		
		for(int i = 0; i<this.size; i++) {
			if(this.elements[i].equals(obj)) {
				this.elements[i] = null;
				removeu = true;
				index = i;
				break;
			}
		}
		
		if(removeu == true) {
			for(int i = index; i < this.capacity-1; i++) {
				this.elements[i] = this.elements[i+1];
			}
			
			size--;
			return true;
		}

		return false;
	}
	
	public Object remove(int index){
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		Object removed = this.elements[index];
		
		this.elements[index] = null;
		
		for(int i = index; i< this.capacity - 1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		
		size--;
		return removed;
		
	}
	
	public Object set(int index, Object obj){
		
		Object subst = this.elements[index];
		
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		this.elements[index] = obj;
		
		return subst;
		
	}

	public void trimToSize() {
		Object[] newArray = new Object[this.size];
		
		for(int i = 0; i<size; i++) {
			newArray[i] = this.elements[i];
		}
		
		this.elements = newArray;
		this.capacity = this.size;
	}
	
	
	
	private void aumentarCapacidade() {
		Object[] novo = new Object[this.capacity*=2];
		for(int i = 0; i<size; i++){
			novo[i] = this.elements[i];
		}
		
		this.elements = novo;
		
	}
}
