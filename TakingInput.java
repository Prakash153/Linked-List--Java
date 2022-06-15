package LinkedList;

import java.util.Scanner;

public class TakingInput {
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node takeinput() {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        int data = sc.nextInt();
        while (data != -1) {
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                tail.next = new_node;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nodes in the list ");
        Node head = takeinput();
        printList(head);
    }
}
