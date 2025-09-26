class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
     int n=height.length;
     List<Integer> arr=new ArrayList<>(n);
     for(int i=1;i<n;i++){
       if(height[i-1]>threshold){
        arr.add(i);
       } 
     }
     return arr;
    }
}