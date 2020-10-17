package com.cg.datastructures;


public class LinkedList {

    Node head;

    public static class Node {
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        head.setNext(second);
        second.setNext(third);
        third.setNext(null);

        displayList(head);
        int pos=searchAndInsert(head,30,40);
        if(pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element inserted at:"+pos);
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

    public static Node pop(Node head) {
        Node temp = head;
        head = head.next;
        return head;

    }

    public static Node popLast(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;

        }
        current.next = null;
        return head;
    }

    public static int search(Node head, int data) {
        int position = 1;
        boolean found = false;
        Node current = head;
        while (current.next != null) {
            if (current.data == data) {
                found = true;
                break;
            }
            current = current.next;
            position++;
        }
        if (found == true)
            return position;
        else
            return -1;
    }

    public static int searchAndInsert(Node head,int data,int insert_data)
    {   Node newNode=new Node(insert_data);
        Node current=head;
        int position=1;
        boolean found=false;
        while(current.next!=null)
        {
            if(current.data==data)
            {
                newNode.next=current.next;
                current.next=newNode;
                found=true;
                break;
            }
            current=current.next;
            position++;
        }
        if(found==true)
        return position+1;
        else
            return -1;
    }

}
