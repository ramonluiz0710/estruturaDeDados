package listas;

public class ListaEncadeada {
		private ListNode head;
		private ListNode tail;
		private int size;
		

		protected class ListNode {
			private Object element;
			private ListNode next;
			public ListNode(Object element, ListNode next) {
				this.element = element;
				this.next = next;
			}
		}
		
		public ListaEncadeada() {
			this.size = 0;
			this.head = this.tail = null;
		}
		
		public int size() {
			return this.size;
		}
		
		public boolean isEmpty() {
			return this.size==0;
		}
		
		public boolean add(Object element) {
			ListNode newElement = new ListNode(element, null);
			
			if(isEmpty()) {
				this.head = newElement;
				}else {
					this.tail.next = newElement;
				}
			
			this.tail = newElement;
			this.size ++;
			return true;
		}
		
		public void add(int index, Object obj) {
			
			if(index < 0 || index > size()) {
				throw new IndexOutOfBoundsException("Index invalido!");
			}
			
			ListNode elem = this.head;
			ListNode newElem = new ListNode(obj, null);
			
			if(index == 0) {
				ListNode prox = this.head;
				this.head = newElem;
				this.head.next = prox;
			}else if(index == size) {
				this.tail.next = newElem;
			}else {
				for(int i = 0; i<index +1; i++) {
					if(i == index) {
						newElem.next = elem;
						findPrevious(elem).next = newElem;
					}else {
						elem = elem.next;
					}
				}
			}
			size++;
		}
		
		public void clear() {
			this.head = this.tail = null;
			this.size = 0;
		}
		
		public void print() {
			ListNode newElem = this.head;
			
			while(newElem != null) {
				System.out.println(newElem.element);
				newElem = newElem.next;
			}
		}
		
		public Object get(int index) {
			
			if(index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Posicao invalida!");
			}
			ListNode elem = head;
			int pos = 0;
			
			for(int i = 0; i < size; i++) {
				if(index == pos) {
					return elem.element;
				}else {
					elem = elem.next;
					pos++;
				}
				
			}
			
			return -1;
		}
		
		public int indexOf(Object obj) {
			ListNode elem = this.head;
			int pos = 0;
			while(elem != null) {
				if(elem.element.equals(obj)) {
					return pos;
				}else {
					elem = elem.next;
					pos++;
				}
			}
			
			return -1;
		}
		
		private ListNode findPrevious(ListNode elem) {
			ListNode newElem = this.head;
			
			while(newElem != null) {
				if(newElem.next == elem) {
					return newElem;
				}else {
					newElem = newElem.next;
				}
				
			}
			
			return null;
		}
		
		public boolean remove(Object obj) {
			ListNode elem = this.head;
			boolean removeu = false;
			
			if(obj == elem.element) {
				this.head = this.head.next;
				removeu = true;
			}else if(obj == this.tail) {
				this.tail = findPrevious(this.tail);
				this.tail.next = null;
				removeu = true;
			}else {
				for(int i=0; i<size; i++) {
					if(elem.element == obj){
						findPrevious(elem).next = elem.next;
						removeu = true;
						break;
					}
				}
			}
			
			if(!removeu) {
				return false;
			}
			
			size--;
			return true;
		}
		
		public Object remove(int index) {
			
			if(index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Posicao invalida!");
			}
			
			ListNode elem = this.head;
			
			if(index == 0) {
				this.head = this.head.next;
				return elem;
			}else if(index == size-1) {
				findPrevious(this.tail).next = null;
				return this.tail;
			}else {
				for(int i = 0; i < size; i++) {
					if(i == index) {
						findPrevious(elem).next = elem.next;
						break;
					}else {
						elem = elem.next;
					}
				}
			}
			
			return elem;
		}
		
		public Object set(int index, Object obj) {
			
			if(index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Posicao invalida!");
			}
			ListNode elem = this.head;
			Object remov = null;
			
			for(int i = 0; i < size; i++) {
				if(index == i) {
					remov = elem.element;
					elem.element = obj;
				}else {
					elem = elem.next;
				}
			}
			
			return remov;
		}

}
