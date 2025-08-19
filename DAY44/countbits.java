package DAY44;

public class countbits {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            int r=i;
            while(r!=0){
                if((r&1)!=0){
                    arr[i]++;
                }

                r=r>>1;
            }

        }
        return arr;
    }


    //optimal using DP
    //   public int[] countBits(int n) {
    //     int arr[]=new int[n+1];
    //     for (int i = 1; i <= n; i++) {
    //         arr[i] = arr[i >> 1] + (i & 1);
    //     }
        
    //     return arr;
    // }
}
