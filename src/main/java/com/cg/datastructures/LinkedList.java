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
        Node head = new Node(70);

        Node newHead=LinkedList.adding(head,30);
        Node newHead1=LinkedList.adding(newHead,50);
        displayList(newHead1);

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


}
