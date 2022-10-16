package DoublyLinkedList;

public class DDMain {

  public static void main(String[] args) {
	DoubleLinkedList dll = new DoubleLinkedList(0);
	dll.append(1);
	dll.append(2);

	dll.printList();
	dll.remove(1);
	dll.printList();

//
////	(2) Items - Returns 2 Node
//	System.out.println(dll.get(1).value);
//	//(1) Items - Returns 1 Node
//	System.out.println(dll.get(2).value);


	//(2) Items - Returns 2 Node
//	System.out.println(dll.removeLast().value);
//	//(1) Items - Returns 1 Node
//	System.out.println(dll.removeLast().value);
//	//(0) Items - Returns null
//	System.out.println(dll.removeLast());




  }
}
