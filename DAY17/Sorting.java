package DAY17;

public class Sorting {
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }



    public static void selectionsort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }



    public static void insertionsort(int[] arr){
          for(int i=1;i<arr.length;i++){
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>arr[i]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
          }
         
    }


    public static void countingsort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

           int j=0;
        for(int i=0;i<count.length;i++){
                 arr[j]=i;
                 j++;
                 count[i]--;
        }

    }
}
