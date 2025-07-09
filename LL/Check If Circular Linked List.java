/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        // Node temp = head.next;
        // while(temp != head || temp!= null){
        //     if(temp == head ){
        //         return true;
        //     }
        //     if(temp == null){
        //         return false ;
        //     }
        //     temp = temp.next;
        // }
       
        //   return false ;
           
           if(head == null){
               return true;
           }
           
           Node slow = head ;
           Node fast = head.next;
           while(fast != null && fast.next != null){
               if(slow == fast){
                   return true ;
               }
               slow = slow.next;
               fast = fast.next.next;
               
           }
           
           return false;
            }
}
