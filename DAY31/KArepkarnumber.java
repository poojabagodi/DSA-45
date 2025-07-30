package DAY31;
import java.util.*;
public class KArepkarnumber {
    public static int digits(int n){
        int i=0;
        while(n>0){
            n=n/10;
            i++;
        }
        return i;
    }

    public static int rev(int n){
        int reve=0;
        while(n>0){
            int rem=n%10;
            reve=reve*10+rem;
            n=n/10;
        }
        return reve;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int digitsofk=digits(k);
        int n=k*k;
        int digitsOfn=digits(n);
        if(digitsOfn==digitsofk){
            if(k==n){
                System.out.println("Karper num");
            }
            else{
                System.out.println("Not a Karper num");
            }
        }
        else if(digitsOfn>digitsofk){
            int rightpart=0;
            int leftpart=0;
            int r=0;
            int a=n;
            while(r!=digitsofk){
                int rem=a%10;
                rightpart=rightpart*10+rem;
                r++;
                a=a/10;
            }
            leftpart=a;
            rightpart=rev(rightpart);
            if(leftpart+rightpart==k){
                System.out.println("Karper num");
            }
            else{
                System.out.println("Not a Karper num");
            }

        }
        else{
                System.out.println("Not a Karper num");
        }

    }
}
