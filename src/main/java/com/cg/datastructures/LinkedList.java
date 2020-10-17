package com.cg.datastructures;

public class LinkedList {

    private Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(56);

        Node newTail=LinkedList.append(head,head,30);
        Node newTail2=LinkedList.append(head,newTail,70);
        displayList(head);

    }

    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);

    }

    public static Node adding(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static Node append(Node head,Node tail,int data)
    {
        Node newNode=new Node(data);
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        newNode.next=null;
        newNode=tail;
        return  tail;
    }


}
