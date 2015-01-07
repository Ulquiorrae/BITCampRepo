package Vježbe;

public class LinkedListIntTEST {

	public static void main(String[] args) {
		
		LinkedListInt newList = new LinkedListInt();
		
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		
		newList.printList();
		
		newList.removeAt(3);
		
		System.out.println("#################");
		
		newList.printList();
		
	}
	
}
