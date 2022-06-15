package LinkedList;

public class ReverseSinglyList {
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node ReverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;  // storing next reference
            curr.next = prev;     // reveresing
            prev = curr;        // taking prev node forward
            curr = temp;      // putting stored reference to its place
        }
        return prev;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);
        head.next.next.next.next.next = new Node(70);
        printList(head);
        System.out.println();
        Node Reversed = ReverseList(head);
        printList(Reversed);
    }
}
