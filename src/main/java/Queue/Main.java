package Queue;

public class Main {
  public static void main(String[] args) {
    Queue q = new Queue(2);

    q.enqueue(1);
//    q.printQueue();
//    (2) Items - Returns 2 Node
	System.out.println(q.dequeue().value);
	//(1) Items - Returns 1 Node
	System.out.println(q.dequeue().value);
	//(0) Items - Returns null
	System.out.println(q.dequeue());


  }
}
