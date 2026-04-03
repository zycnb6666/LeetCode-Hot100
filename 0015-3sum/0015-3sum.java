class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i=0;i<l-2;i++){
            int x=nums[i];
            if(i>0&&x==nums[i-1])continue;
            int j=i+1;
            int k=l-1;
            while(j<k){
                int s=x+nums[j]+nums[k];
                if(s>0)k--;
                else if(s<0) j++;
                else{
                    List<Integer> list=new ArrayList<>();
                    list.add(x);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    } 
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}