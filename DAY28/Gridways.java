package DAY28;

public class Gridways {
    public static int findways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n && j==m){
            return 0;
        }
        int ways1=findways(i+1,j,n,m);
         int ways2=findways(i,j+1,n,m);
         return ways1+ways2;
    }

    public static long factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static long permutationways(int m,int n){
     return  factorial(n+m)/factorial(n)*factorial(m);
    }
}
