class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] res=new int[n+n];
       int j=n,i=0;
       for(int k=0;k<(n+n);k++){
          if(k%2==0){
            res[k]=nums[i];
            i++;
          }else{
            res[k]=nums[j];
            j++;
          }
       } 
       return res;
    }
}