package tree;


public class BinarySearchTree {
	
	private BinaryNode root;
	
	private class BinaryNode{
		int element;
		BinaryNode left;
		BinaryNode right;
		
		private BinaryNode(int element, BinaryNode left, BinaryNode right ) {
			this.element = element;
			this.left= left;
			this.right = right;
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	
	public int getRoot() {
		return root.element;
	}



	public void setRoot(BinaryNode root) {
		this.root = root;
	}


	public void clear() {
		root = null;
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	
	public void insert(int element) {
		root = insert(element, root);
	}
	
	private BinaryNode insert(int element, BinaryNode node) {
		
		if(node == null) {
			node = new BinaryNode(element, null, null);
		}else if(element < node.element) {
			node.left = insert(element, node.left);
		}else if(element > node.element) {
			node.right = insert(element, node.right);
		}
		
		return node;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Arvore vazia!");
		}else {
			print(root);
		}
	}
	
	private void print(BinaryNode t) {
		if(t != null) {
			print(t.left);
			System.out.println(t.element);
			print(t.right);
		}
	}
	
	public boolean find(int x) {
		return find(x, root) != null ? true:false;
	}
	
	private BinaryNode find(int x, BinaryNode t) {
		if(t != null) {
			if(x < t.element) {
				return find(x, t.left);
			}else if(x > t.element) {
				return find(x, t.right);
			}else {
				return t;
			}
		}
		
		return null;
	}
	
	public int findMin() {
		return findMin(root).element;
	}
	
	private BinaryNode findMin(BinaryNode t) {
		if(t == null) {
			return null;
		}
		
		if(t.left != null) {
			return findMin(t.left);
		}
		
		return t;
	}
	
	public int findMax() {
		return findMax(root).element;
	}
	
	private BinaryNode findMax(BinaryNode t) {
		if(t.right != null) {
			while(t.right != null) {
				t=t.right;
			}
		}
		
		return t;	
	}
	
	public void remove(int x) {
		remove(x, root);
	}
	
	private BinaryNode remove(int x, BinaryNode t) {
		
		if(t == null) {
			return null;
		}else if(x < t.element) {
			t.left = remove(x, t.left);
		}else if(x > t.element) {
			t.right = remove(x, t.right);
		}else if(t.left != null && t.right != null) {
			t.element = findMin(t.right).element;
			t.right = remove(t.element, t.right);
		}else {
			t = (t.left != null) ? t.left:t.right; 
		}
		
		return t; 
	}

}
