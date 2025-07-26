package DAY28;

public class maxconayinerwithwater {
    public static void main(String args[]){
        int height[]={1,8,6,2,5,4,8,3,7};
        int lp=0;
        int rp=height.length-1;
        int maxwater=0;
          while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            maxwater=Math.max(maxwater,ht*width);
            if(height[lp]<height[rp]){
                lp++;

            }
            else{
                rp--;
            }
          }

          System.out.println(maxwater);
    }
}
