package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

  HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

  public boolean addVertex(String vertex) {
	if (graph.get(vertex) == null) {
	  graph.put(vertex, new ArrayList<String>());
	  return true;
	}
	return false;
  }

  public boolean addEdge(String vertex1, String vertex2) {
	if (graph.get(vertex1) != null && graph.get(vertex2) != null) {
	  graph.get(vertex1).add(vertex2);
	  graph.get(vertex2).add(vertex1);
	  return true;
	}
	return false;
  }

  public boolean removeEdge(String vertex1, String vertex2) {
	if (graph.get(vertex1) != null && graph.get(vertex2) != null) {
	  graph.get(vertex1).remove(vertex2);
	  graph.get(vertex2).remove(vertex1);
	  return true;
	}
	return false;
  }

  public boolean removeVertex(String vertex) {
	if (graph.get(vertex) == null) return false;
	for (String otherVertex : graph.get(vertex)) {
	  graph.get(otherVertex).remove(vertex);
	}
	graph.remove(vertex);
	return true;
  }

  public void printGraph() {
	System.out.println(graph);
  }
}
