package HashTable;

public class Main {
  public static void main(String[] args) {
	HashTable hashTable = new HashTable();
	hashTable.set("nails",100);
	hashTable.set("tile",50);
	hashTable.set("lumber",80);
	hashTable.set("paint",20);
	hashTable.set("bolts",40);
	System.out.println(hashTable.getAllKeys());
	hashTable.printTable();
  }
}
