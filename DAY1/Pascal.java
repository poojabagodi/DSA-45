package DAY1;

public class Pascal {
    // Function to calculate nCr
    //function if row is n and column is r
    public static int ncr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    // Function to print the nth row of Pascal's triangle
    
    public static void ncrRow(int n){
        int ans=1;
         System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
            
        }
    }
    // Function to print the first n rows of Pascal's triangle
    public static void pascal(int n){
        for(int i=1;i<=n;i++){
            ncrRow(i);
            System.out.println();
        }
    }
    public static void main(String args[]){
       System.out.println(ncr(3,2));
       ncrRow(4);
       pascal(6);
    } 

}
