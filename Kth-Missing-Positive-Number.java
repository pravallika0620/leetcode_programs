class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
       int count=0;
       int ans=0;
       int j=0;
       for(int i=1;i>0;i++){
         if(j<n && arr[j]==i){
            j++;
         }else{
            count++;
           if(count==k){
            ans=i;
            break;
           } 
         }
       }  
         return ans; 
    }
}