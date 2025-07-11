
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList <ArrayList <Integer>> res = new ArrayList<>();
        
       Node f = head ;
       Node s = head;
       while (s.next !=  null){
           s = s.next;
       }
       while(f != s && s.next != f){
           if((s.data + f.data)== target ){
               ArrayList <Integer> pair = new ArrayList<>();
               pair.add(f.data);
               pair.add(s.data);
               res.add(pair);
               
               
            //   first = first.next;
             f = f.next;
             s = s.prev;
           }else{
               if((f.data + s.data)<target){
                   f =f.next;
               }else{
                   s = s.prev;
               }
           }
           
       }
         return res;
    }
  
}
