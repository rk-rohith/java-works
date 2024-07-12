package javacodingquestions;



public class ReverseLinkedList {
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        printLinkedList(head);

        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("\nReversed linked list:");
        printLinkedList(reversedHead);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // Store next node
            curr.next = prev; // Reverse current node's pointer
            prev = curr; // Move pointers one position ahead
            curr = nextTemp; // Move to the next node
        }

        return prev; // Prev is the new head of reversed list
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

