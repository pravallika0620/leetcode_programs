class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxval=0;
      for(int i=0;i<accounts.length;i++){
        int[] arr=new int[accounts[i].length];
        arr=accounts[i];
        int max=0;
        for(int j=0;j<arr.length;j++){
         max+=arr[j];
        }
        if(max>maxval){
            maxval=max;
        }
      }  
      return maxval;
    }
}