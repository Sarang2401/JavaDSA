import java.util.*;

publis class Demo1{

    Node head;
    Node tail;

    public Node insertFirst(data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public Node display(){
        Node curr = head;
        while(curr != 0){
            System.out.print(curr.data + ">");
            curr = curr.next;
        }
        System.out.println("END");   
    }


    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static void main(String[] args){
        DoublyLL list = new DoublyLL();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
    }

}