package trees;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

  Node root;

  public BinarySearchTree() {
	root = null;
  }

  class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
	  this.value = value;
	}
  }

  public boolean insert(int value) {
	Node newNode = new Node(value);
	if (root == null) {
	  root = newNode;
	  return true;
	}
	Node temp = root;
	while (true) {
	  if (newNode.value == temp.value) return false;
	  if (newNode.value < temp.value) {
		if (temp.left == null) {
		  temp.left = newNode;
		  return true;
		}
		temp = temp.left;
	  } else {
		if (temp.right == null) {
		  temp.right = newNode;
		  return true;
		}
		temp = temp.right;
	  }
	}
  }

  public ArrayList<Integer> BFS() {
	Node currentNode = root;
	Queue<Node> queue = new LinkedList<>();
	ArrayList<Integer> results = new ArrayList<Integer>();
	queue.add(currentNode);
	 while(queue.size() > 0){
	   currentNode = queue.remove();
	   results.add(currentNode.value);
	   if(currentNode.left !=null){
		 queue.add(currentNode.left);
	   }
	   if(currentNode.right != null){
		 queue.add(currentNode.right);
	   }
	 }
	 return results;
  }
	public ArrayList<Integer> DFSPreOrder(){
	ArrayList<Integer> results = new ArrayList<Integer>();
	class Traverse{
	  Traverse(Node currentNode){
		results.add(currentNode.value);
		if(currentNode.left!=null){
		  new Traverse(currentNode.left);
		}
		if(currentNode.right != null){
		  new Traverse(currentNode.right);
		}
	  }
	}
	new Traverse(root);
	return results;
	}
	public ArrayList<Integer> DFSPostOrder(){
		ArrayList<Integer> result = new ArrayList<>();
		class Traverse{
		  Traverse(Node currentNode){
			if(currentNode.left != null){
			  new Traverse(currentNode.left);
			}
			if(currentNode.right != null){
			  new Traverse(currentNode.right);
			}
			result.add(currentNode.value);
		  }
		}
		new Traverse(root);
		return result;
	}

  public ArrayList<Integer> DFSInorder(){
	ArrayList<Integer> results = new ArrayList<>();
	class Traverse{
	  Traverse(Node currentNode){
		if(currentNode.left != null){
		  new Traverse(currentNode.left);
		}
		results.add(currentNode.value);
		if(currentNode.right != null){
		  new Traverse(currentNode.right);
		}
	  }
	}
	new Traverse(root);
	return results;
  }

  public boolean contains(int value) {
	if (root == null) return false;
	Node temp = root;
	while (temp != null) {
	  if (value < temp.value) {
		temp = temp.left;
	  } else if (value > temp.value) {
		temp = temp.right;
	  } else {
		return true;
	  }
	}
	return false;
  }
}
