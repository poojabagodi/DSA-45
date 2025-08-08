package DAY38;
import java.util.*;
class Dailytempanalysis {
  public static int[] nextgreater(int[] arr,int k){
    int n=arr.length;
    if(n==0 ||k>n) return new int[0];
    
    int[] ans=new int[n-k+1];
    Deque<Integer> dq=new LinkedList<>();
    
    for(int i=0;i<n;i++){
      while(!dq.isEmpty() && dq.peekFirst()<=i-k){
        dq.pollFirst();
      }

      while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
        dq.pollLast();
      }

      dq.offerLast(i);

      if(i>=k-1){
        ans[i-k+1]=arr[dq.peekFirst()];
      }
    }
    return ans;
  }
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  int k=sc.nextInt();
  int ans[]=nextgreater(arr,k);
  for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
  }
}

  
}