package DAY11;

import java.util.ArrayList;

import java.util.Collections;

public class Subsetsum {


    static void func(int[] arr,int sum,int index,int n,ArrayList<Integer> result){
        if(index==n){
            result.add(sum);
            return;
        }
        //to pick element
        func(arr,sum+arr[index],index+1,n,result);
        //to not pick element
        func(arr,sum,index+1,n,result);

    }
    public static ArrayList<Integer> subset(int[] arr,int n){
        ArrayList<Integer> result=new ArrayList<>();
        func(arr,0,0,n,result);
        Collections.sort(result);
        return result;
       
    }

    public static void main(String args[]) {


       int arr[] = { 1, 2, 3 };
        int n = arr.length;
        ArrayList < Integer > ans = subset(arr, n);
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}
