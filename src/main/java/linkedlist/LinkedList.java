package linkedlist;

public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  LinkedList(int value) {
	Node newNode = new Node(value);
	this.head = newNode;
	this.tail = newNode;
	this.length += 1;
  }

  static class Node {
	private int value;
	private Node next;

	Node(int value) {
	  this.value = value;
	}
  }

//  public void insertNode(int value) {
//	Node newNode = new Node(value);
//
//  }

  public void printLinkedList() {
	Node temp = head;
	while (temp != null) {
	  System.out.print(temp.value+"->");
	  temp = temp.next;
	}
	System.out.println();
  }

  public void append(int value) {
	Node newNode = new Node(value);
	if (length == 0) {
	  head = newNode;
	  tail = newNode;
	} else {
	  tail.next = newNode;
	  tail = newNode;
	}

	length++;
  }
	public Node removeLastNode(){
	if(length == 0) return null;
	Node temp = head;
	Node pre = head;
	while(temp.next != null){
	  pre =temp;
	  temp = temp.next;
	}
	tail = pre;
	tail.next = null;
	length--;
	if(length == 0){
	  head = null;
	  tail = null;
	}
//	  System.out.println(temp.value);
	return temp;

	}

	public void reverse(){
	Node temp = head;
	head = tail;
	tail = head;
	Node after = temp.next;
	Node before = null;
	for(int i =0; i< length;i++){
	  after = temp.next;
	  temp.next = before;
	  before = temp;
	  temp = after;
	}
	}
	public Node removeFirstNode(){
		if(length == 0) {
		  return null;
		}
		Node temp = head;
		head = head.next;
	    temp.next = null;
		length--;
		if(length == 0){ /* This last if condition is to check for edge of single element in the linkedlist*/
		  tail = null;
		}
	  printLinkedList();
		return temp;
	}
	public Node get(int index){
	Node temp = head;
	if(index < 0 || index >= length){
	  return null;
	}
	else{
	  for(int i = 0;i< index;i++){
		temp = temp.next;
	  }
	  return temp;
	}

	}
	public boolean set(int index , int value){
	Node temp = get(index);
	if(temp !=null){
	  temp.value =value;
	  printLinkedList();
	  return true;
	}
	else
	  return false;
//		Node newNode = new Node(value);
//		Node temp = head;
//		Node pre = head;
//		for(int i = 0; i < index;i++){
//		  pre = temp;
//		  temp = temp.next;
//		}
//		pre.next = newNode;
//		newNode.next = temp;


	}
	public void prepend(int value){
		Node newNode = new Node(value);
		if(length == 0){
		  head = newNode;
		  tail = newNode;
		}else{
//		  Node temp = head;
//		  head = newNode;
//		  head.next = temp;
		  newNode.next = head;
		  head = newNode;
		}
		length++;
	  System.out.println(value +" The value has been to linked List");
	  printLinkedList();
	}
  public void getHead() {
	System.out.println("head : " + head.value);
  }

  public void getTail() {
	System.out.println("tail : " + tail.value);
  }

  public void getLength() {
	System.out.println("length : " + length);
  }
}
