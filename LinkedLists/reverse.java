import java.util.*;

public class Demo1{
		Node head;
	    class Node{
	    	String data;
	    	Node next = null;
	    
	    Node(String data){
	    	this.data = data;
	    	this.next = null;
	 }
};
		public void addFirst(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
			
		}
		public void addLast(String data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
			newNode.next = null;
		}
		public void printList() {
			Node curr = head;
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			while (curr != null) {
				
				System.out.println(curr.data + ">");
				curr = curr.next;
				
			}
		}
		
		public Node reverseRecursive(Node head) {
			if(head == null || head.next ==null) {
				return head;
			}
			Node newHead = reverseRecursive(head.next);
			head.next.next = head;
			head.next = null;
			
			return newHead;
			
		}

		

		public static void main(String[] args) {
			Demo1 list = new Demo1();
			list.addFirst("Sarang");
			list.addLast("Shigwan");
			list.printList();
			list.head = list.reverseRecursive(list.head);
			list.printList();
		}




}
	
    