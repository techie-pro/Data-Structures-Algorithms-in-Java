package Graph;

public class Main {

  public static void main(String[] args) {
	Graph g = new Graph();
	g.addVertex("A");
	g.addVertex("B");
	g.addVertex("C");
	g.addVertex("D");

	g.addEdge("A","B");
	g.addEdge("A","C");
	g.addEdge("A","D");
	g.addEdge("B","D");
	g.addEdge("C","D");
	g.removeVertex("D");
	g.printGraph();

  }
}
