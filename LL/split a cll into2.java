   /* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        
        if (head == null) {
            return new Pair<>(null,null);
        }

        Node slow = head;
        Node fast = head;

        // Find the middle node
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If even number of nodes, move slow one more step
        if (fast.next.next == head) {
            fast = fast.next;
        }

        // Split the list into two halves
        Node secondHead = slow.next;
        slow.next = head; // Make first half circular
        fast.next = secondHead; // Make second half circular

        return new Pair<>(head, secondHead);
        
    }
}
