class Solution {
    public int search(int[] nums, int target) {
        if(length==0) return -1;
        int end = length-1;
        while (start!=end){
            if(nums[end]==target) return end;
            if(end==start+1) return -1;
            int index = (start + end)/2;
            if(nums[index]==target){
                return index;
            }
            if(nums[index]>nums[start]){
                if(target>nums[index]||target<nums[start]){
                    start = index + 1;
                    continue;
                }else{
                    end = index - 1;
                    continue;
                }                
            }
            if(nums[index]<nums[start]){
                if(target>nums[start] || target < nums[index]){
                    end = index -1;
                    continue;
                }else{
                    start = index + 1;
                    continue;
                }
            }
            if(index==start){
                
            }
        }
        if(nums[start]==target){
            return start;
        }else{
            return -1;
        }
        
    }
}