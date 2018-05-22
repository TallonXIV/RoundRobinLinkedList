public class RoundRobin {
	public static void main(String[] args) {
		ListFunctions LF = new ListFunctions(); 
		LF.makeNode(5);
		LF.makeNode(7);
		LF.makeNode(20);
		LF.makeNode(1);
		
		LF.makeDoublyLinkedList();
		
		int numberOfNodes = LF.nodeCount();
		System.out.println("List of Processes before Round Robin Algorithm: ");
		LF.printList();
		
		System.out.println("\nList of Processes after Round Robin Algorithm: ");
		LF.roundRobinImplementation();
	}
}
