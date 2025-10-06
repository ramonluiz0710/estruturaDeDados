package app;
import lists.ArrayLists;
public class ArrayListsApp {

	public static void main(String[] args) {
		
		ArrayLists newList = new ArrayLists();
		
		System.out.println(newList.isEmpty());
		System.out.println();
		
		newList.add("RAmon");
		newList.add("Joao");
		newList.add("Carla");
		newList.add("INgrid");
		newList.add("Juan", 2);
		
		newList.print();
		System.out.println();
		
		newList.remove(1);
		newList.remove("RAmon");
		newList.remove("Janaina");
		
		
		
		newList.print();
		System.out.println();
		
		System.out.println(newList.size());
		System.out.println();
		
		newList.trimToSize();
		
		newList.clear();
		
		
		System.out.println(newList.isEmpty());
	}

}
