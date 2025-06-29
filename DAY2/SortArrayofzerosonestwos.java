package DAY2;

public class SortArrayofzerosonestwos {
    public static void main(String args[]){
        int[] arr={0,1,2,0,0,1,2,0};
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;

            }

            else if(arr[mid]==1){
                mid++;
            }
            else{
                int tem=arr[high];
                arr[high]=arr[mid];
                arr[mid]=tem;
                high--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
