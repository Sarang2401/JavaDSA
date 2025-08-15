import java.util.*;

public class Demo1 {
    
    public class Node {
        int data;
        Node next;
        Node prev;
        
        Node(int data){
            this.data = data;
        }

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    Node tail;
    int size;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    public void inRecursive(int data, int index){
        head = inRecursive(data, index, head);
    }
    public Node inRecursive(int data, int index, Node node){
        if(index == 0) {
        	Node temp = new Node(data, node);	
        	size++;
        	return temp;
        }
        node.next = inRecursive(data, index--, node.next);
        return node;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + ">");
            curr = curr.next;
        }
        System.out.println("END");   
    }

    public void revdisplay(){
        Node curr = tail;
        while(curr != null){
            System.out.print(curr.data + ">");
            curr = curr.prev;
        }
        System.out.println("END");   
    }

    public static void main(String[] args){
        Demo1 list = new Demo1();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();  
        list.inRecursive(2, 5);
        list.display();     
       // list.revdisplay();  
    }
}
