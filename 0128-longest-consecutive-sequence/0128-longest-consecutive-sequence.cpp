class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set;
        for(int num:nums){
            set.insert(num);
        }

        int res=0;
        for(int num:set){
            if(!set.count(num-1)){
                int first=num;
                int len=1;
                while(set.count(first+1)){
                    first+=1;
                    len+=1;
                }
                res=max(len,res);
            }
        }
        return res;
    }
};