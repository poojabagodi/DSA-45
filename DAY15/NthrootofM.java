package DAY15;

public class NthrootofM {
    public static int func(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }

    public static int root(int n,int m){
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(mid, n, m)==1){
                return mid;
            }
            else if(func(mid, n, m)==2){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println("Nth Root: " + root(n, m)); // Output should be 3
    }
}
