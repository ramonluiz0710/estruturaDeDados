package app;

import tree.BinarySearchTree;

public class App {

	public static void main(String[] args) {
		BinarySearchTree b1 = new BinarySearchTree();
		
		b1.insert(5);
		b1.insert(3);
		b1.insert(7);
		b1.insert(2);
		b1.insert(6);
		b1.insert(10);
		b1.insert(1);
		b1.insert(4);
		b1.insert(9);
		b1.insert(8);
		
		b1.print();
		System.out.println();
		
		System.out.println(b1.findMin());
		System.out.println();
		
		b1.remove(7);
		
		b1.print();
		System.out.println();
		
		System.out.println(b1.findMax());
		System.out.println();
		
		System.out.println(b1.find(2));
		System.out.println();
	}

}
