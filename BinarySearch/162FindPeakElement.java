class Solution {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                //increasing part - climbing peak
                start = mid+1;
            }
            else{
                //decreasing part 
                end = mid;
            }
        }
        return start;
    }
}

// 0 1 2 3
// 1 2 3 1
// s m   e 
//     s e
//     m
//     e return s;
//mid= 0+ 3/2=1.5
