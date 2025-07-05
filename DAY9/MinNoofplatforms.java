
//  We are given two arrays that represent the arrival and departure times of trains that stop at the platform. We need to find the minimum number of platforms needed at the railway station so that no train has to wait.

// Examples 1:

// Input: N=6, 
// arr[] = {9:00, 9:45, 9:55, 11:00, 15:00, 18:00} 
// dep[] = {9:20, 12:00, 11:30, 11:50, 19:00, 20:00}

// Output:3


package DAY9;
public class MinNoofplatforms {

    public static void main(String[] args) {
    int arr[]={900, 945, 955, 1100, 1500, 1800} ;
    int dep[]={920, 1200, 1130, 1150, 1900, 2000} ;
    int n=6;
    int ans=1;
    for(int i=0;i<n-1;i++){
         int count=1;
         for(int j=i+1;j<n;j++){
            if((arr[i]>=arr[j] && arr[i]<=dep[j] )||(arr[j]>=arr[i] && arr[j]<=dep[i]) ){
                count++;
            }
         }
         ans=Math.max(ans,count);
    }

    System.out.println("Minimum number of platforms needed: " + ans);
}
}
