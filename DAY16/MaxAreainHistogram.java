import java.util.*;
public class MaxAreainHistogram {
    public static int maxArea(int[] arr){
        int maxarea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //Next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
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


        //next smaller left 
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
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
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxarea=Math.max(maxarea,currArea);
        }

        return maxarea;
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}
