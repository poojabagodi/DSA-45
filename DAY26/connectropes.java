package DAY26;
import java.util.*;





class main{
    public static void main(String args[]){
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=(min+min2);
            pq.add(min+min2);
        }
        
        System.out.println("cost of connectiong n ropes :"+cost);
        
    }
}





// --weakest soldier


// import java.util.*;
// class main{
    
//     static class rows implements Comparable<rows>{
//         int soldiers;
//         int idx;
//         rows(int soldiers,int idx){
//             this.soldiers=soldiers;
//             this.idx=idx;
            
//         }
//         @
        
//         @Override
//         public int compareTo(rows r2){
//             if(r2.soldiers==this.soldiers){
//                 return this.idx-r2.idx;
//             }
//             else{
//                 return this.soldiers-r2.soldiers;
//             }
//         }
//     }
    
    
    
//     public static void main(String args[]){
//        int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
//        int k=2;
//        PriorityQueue<rows> pq=new   PriorityQueue<>();
//        for(int i=0;i<arr.length;i++){
//            int count=0;
//            for(int j=0;j<arr[0].length;j++){
//                count+=arr[i][j]==1?1:0;
               
//            }
           
//            pq.add(new rows(count,i));
//        }
        
//     }
// }
// }
