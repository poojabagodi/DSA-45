package DAY26;

import java.util.ArrayList;

public class heaps {
    
    class heap{
        ArrayList<Integer> arr=new   ArrayList<>();
        public void add(int data){
            arr.add(data);
            
            int x=arr.size()-1;
            int par=(x-1)/2;            
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }
        
        public int peek(){
            return arr.get(0);
        }
        
        
        public void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            
            if(minidx!=i){
                int temp=arr.get(minidx);
                arr.set(minidx,arr.get(i));
                arr.set(i,temp);
                heapify(minidx);
            }
        }
        
        
        
        public int remove(){
            int data=arr.get(0);
            
            
            int temp=arr.get(arr.size()-1);
            arr.set(arr.size()-1,arr.get(0));
            arr.set(0,temp);
            
            
            
            
            arr.remove(arr.size()-1);
            
            heapify(0);
            return data;
        }
        
        
        
        public static void heapifymax(int arr[],int i,int size){
            int left=2*i+1;
            int right=2*i+2;
            int maxidx=i;
            
            if(left<size && arr[left]>arr[maxidx]){
                maxidx=left;
            }
            if(right<size && arr[right]>arr[maxidx]){
                maxidx=right;
            }
            
            if(maxidx!=i){
                int temp=arr[i];
                arr[i]=arr[maxidx];
                arr[maxidx]=temp;
                heapifymax(arr,maxidx,size);
            }
        }
        public static void hepsort(int arr[]){
            int n=arr.length;
            for(int i=n/2;i>=0;i--){
                heapifymax(arr,i,n);
            }
            
            
            for(int i=n-1;i>=0;i--){
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                // hepifymax(arr,0,i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
}
