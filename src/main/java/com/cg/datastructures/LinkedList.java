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
        Node second = new Node(30);
        Node third=new Node(70);

        head.next = second;
        second.next = third;
        third.next=null;

        LinkedList.popLast(head);
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

    public static Node adding(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node append(Node head, Node tail, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        newNode = tail;
        return tail;
    }

    public static void insert(Node previous, int data) {
        Node newNode = new Node(data);
        newNode.next = previous.next;
        previous.next = newNode;
    }

    public static Node pop(Node head)
    {
        Node temp=head;
        head=head.next;
        return head;

    }

    public static Node popLast(Node head)
    {
        Node current=head;
        while(current.next.next!=null)
        {
            current=current.next;

        }
        current.next=null;
        return head;
    }


}
