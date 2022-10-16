package stack;

public class Main {
  public static void main(String[] args) {
	Stack st = new Stack(2);
	st.push(1);
	st.printStack();

	st.pop();
	st.printStack();
  }
}
