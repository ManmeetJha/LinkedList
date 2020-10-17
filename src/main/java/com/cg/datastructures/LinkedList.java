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
        Node head = new Node(50);
        Node second = new Node(30);
        Node third = new Node(70);

        head.next = second;
        second.next = third;
        third.next = null;

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

}
