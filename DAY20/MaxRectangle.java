package DAY20;
    import java.util.*;
public class MaxRectangle {

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int leftsmall[]=new int[heights.length];
        int rightsmall[]=new int[heights.length];
        int max=0;
        //left small
        for(int i=0;i<heights.length;i++){
              while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
               s.pop();
              }
              if(s.isEmpty()){
                leftsmall[i]=-1;
              }
              else{
                leftsmall[i]=s.peek();
              }
              s.push(i);
        }

     s.clear();
        //right small
        for(int i=heights.length-1;i>=0;i--){
              while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
               s.pop();
              }
              if(s.isEmpty()){
                rightsmall[i]=heights.length;
              }
              else{
                rightsmall[i]=s.peek();
              }
              s.push(i);
        }

        for(int i=0;i<heights.length;i++){
           max=Math.max(max,heights[i]*(rightsmall[i]-leftsmall[i]-1));
        }
        return max;
       

    }
}
}
