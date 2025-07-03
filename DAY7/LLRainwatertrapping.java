package DAY7;

public class LLRainwatertrapping {
    

    public int trap(int[] height) {
        int maxleft[]=new int[height.length];
        int maxright[]=new int[height.length];
        int watertrapped=0;
        maxleft[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(maxleft[i-1],height[i]);

        }
        maxright[maxright.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
         for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(maxright[i],maxleft[i]);
         watertrapped=watertrapped+(waterlevel-height[i]);
         }
        return watertrapped;
    }
}
