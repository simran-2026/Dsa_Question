/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Reverse the linked list
        head = reverse(head);
        
        Node current = head;
        Node maxNode = head;
        Node temp;
        
        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                temp = current.next;
                current.next = temp.next;
            } else {
                current = current.next;
                maxNode = current;
            }
        }
        
        // Reverse back the modified list
        head = reverse(head);
        return head;
    }
    
    // Helper function to reverse the linked list
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
