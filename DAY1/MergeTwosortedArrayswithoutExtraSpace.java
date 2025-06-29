package DAY1;
// Merge two sorted arrays without using extra space if the length of both arrays is same.
public class MergeTwosortedArrayswithoutExtraSpace {

 
    public static void main(String args[]){
        int a1[] = {4, 6, 9, 10};
        int a2[] = {2, 5, 11,15};
        int j = 0, k = 0;
        
        for(int i=0;i<a2.length;i++){
            if(a1[k]>a2[j]){
                int temp=a1[k];
                a1[k]=a2[j];
                a2[j]=temp;
                
            
            int idx=j;
            
            while(idx+1<a2.length && a2[idx]>a2[idx+1]){
                int temp2=a2[idx];
                a2[idx]=a2[idx+1];
                a2[idx+1]=temp2;
                idx++;
            }
        }
            k++;
            if(k==a1.length){
                j++;
                k=0;
            }
           
        }
         for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }

    
   
}