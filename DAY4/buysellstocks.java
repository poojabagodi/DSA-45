class buysellstocks {
    public int stockBuySell(int[] arr, int n) {
      int minPrice=Integer.MAX_VALUE;
      int maxprofit=0;
      for(int i=0;i<arr.length;i++){
        minPrice=Math.min(minPrice,arr[i]);
        maxprofit=Math.max(maxprofit,arr[i]- minPrice);
      }
      return maxprofit;
}
}