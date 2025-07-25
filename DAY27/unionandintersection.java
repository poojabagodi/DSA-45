package DAY27;
//union and intersection of array

import java.util.*;
public class unionandintersection {
    

class Main {
    public static void main(String[] args) {
        int a[]={1,4,6,8,9};
        int b[]={1,2,3,4,6};
     HashSet<Integer> set=new HashSet<>();   
     for(int i=0;i<a.length;i++){
         set.add(a[i]);
     }
       for(int i=0;i<b.length;i++){
         set.add(b[i]);
     }
     System.out.println(set);
     

    HashSet<Integer> inter=new HashSet<>();
    for(int i=0;i<a.length;i++){
        inter.add(a[i]);
    }
    int count=0;
    for(int i=0;i<b.length;i++){
        if(inter.contains(b[i])){
            System.out.println();
            count++;
            inter.remove(b[i]);
        }
    }
    System.out.println(count);
    
}
    }


}
