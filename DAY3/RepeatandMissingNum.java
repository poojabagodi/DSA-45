public class RepeatandMissingNum {
    public static int missing(int[] arr){
        int mis=0;
        int[] newarr=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;

        }
        for(int i=1;i<newarr.length;i++){
            if(newarr[i]==0){
                mis=i;
            }

        }
        return mis;
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5,2};
        System.out.println(missing(arr));
    }
}
