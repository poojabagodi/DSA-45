package DAY28;

public class Pairsum1 {



    public static boolean found(int num[],int key){
           int lp=0;
         int rp=num.length-1;
        
         while(lp<rp){
            if(num[lp]+num[rp]==key){
               return true;
            }
            else if(num[lp]+num[rp]>key){
                rp--;
            }
            else{
                lp++;
            }
         }

         return false;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
         int key=5;

    }
}
