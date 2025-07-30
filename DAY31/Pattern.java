package DAY31;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
         int b=0;
      for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            if(i==1){
                System.out.print(a);
            }
            else if(i%2==0){
               
                if(j==1){
                    b=a+i;
                   // a=a+1;
                } 
                System.out.print(b+" ");
                b--;
                a++;
            }
            else{
                System.out.print(a+1+" ");
                a++;
                
            }
           
           }
           System.out.println();
      }
    }
}
