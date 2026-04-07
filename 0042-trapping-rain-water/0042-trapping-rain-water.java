class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pre_max=0;
        int beh_max=0;
        int l=0,r=n-1;
        int res=0;
        while( l<=r){
            pre_max=Math.max(height[l],pre_max);
            beh_max=Math.max(height[r],beh_max);
            if(pre_max<beh_max){
                res+=pre_max-height[l];
                l++;
            }
            else{
                res+=beh_max-height[r];
                r--;
            }
        }
        return res;
    }
}