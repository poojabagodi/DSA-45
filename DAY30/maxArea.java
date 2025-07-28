package DAY30;
import java.util.*;
public class maxArea {
    
    public static void maxA(int arr[]){
        int maxare=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
         for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }




        for(int i=0;i<arr.length;i++){
            int ht=arr[i];
            int width=nsr[i]-nsl[i]-1;
            maxare=Math.max(maxare,width*ht);

        }

        System.out.println(maxare);

    }


    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxA(arr);
    }
}
