/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int  getKthFromLast(Node head, int k) {
        // Your code here
        Node mp = head;
        Node rp = head;
   
        for(int i =1;i<k;i++){
            
            rp = rp.next;
            
            if(rp == null){
                return -1;
                
            }
        }
        
        while(rp.next!=null){
            rp= rp.next;
            mp = mp.next;
        }
        return mp.data;
      
    }
}
