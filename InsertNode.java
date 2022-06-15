package LinkedList;

import java.util.Scanner;

public class InsertNode {
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void insert(int data, Node head, int pos) {
        Node toAdd = new Node(data);
        if (pos == 0) {
            toAdd.next = head;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        insert(15, head, 0);
        printList(head);
    }
}
