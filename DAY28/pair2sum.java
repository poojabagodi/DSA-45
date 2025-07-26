package DAY28;

public class pair2sum {
    
    public static boolean found(int num[],int key){
        int bp=-1;
        int n=num.length;
        for(int i=0;i<n-1;i++){
           if(num[i]>num[i+1]){
            bp=i;
            break;
           }
        }

        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(num[lp]+num[rp]==key){
                return true;
            }
            else if(num[lp]+num[rp]>key){
                rp=(n+rp-1)%n;

            }
            else{
                lp=(lp+1)%n;
            }
        }
        return false;
    }
}
